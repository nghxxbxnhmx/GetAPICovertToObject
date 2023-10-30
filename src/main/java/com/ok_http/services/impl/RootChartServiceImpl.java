package com.ok_http.services.impl;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ComparisonPropertiesDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.DetailComparisonDTO;
import com.ok_http.dto.InputPropertiesDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.dto.NodeDetailDTO;
import com.ok_http.models.ContractModel;
import com.ok_http.models.DeviceInfoModel;
import com.ok_http.models.MacContractModel;
import com.ok_http.models.MergeObjectModel;
import com.ok_http.models.RootChartModel;
import com.ok_http.services.GetApiService;
import com.ok_http.services.MergedObjectModelService;
import com.ok_http.services.RootChartService;
import com.ok_http.utils.JsonUtil;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

@Service
public class RootChartServiceImpl implements RootChartService {
    @Autowired
    GetApiService apiService;

    @Autowired
    MergedObjectModelService mergedObjectModelService;

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public RootChartModel getDataRootChart() {
        try {
            String rootChartUrl = "C:\\Java Workspace\\FTEL PROJECT\\ok_http\\src\\main\\resources\\static\\store\\data-rootchart.json";
            String rootChartString = new String(Files.readAllBytes(Paths.get(rootChartUrl)), StandardCharsets.UTF_8);
            return objectMapper.readValue(rootChartString, RootChartModel.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String process() {
        NodeDetailDTO nodeStart = getNodeStart();
        ArrayList<ComparisonPropertiesDTO> listComparisonPropertiesDTO = nodeStart.getComparisonProperties();
    
        ContractModel contractModel = getContractModel();
        MacDTO macDTO = apiService.getMacFromContract();
        DeviceInfoModel allInfoToCpeDTO = apiService.getAllInfoToCPE().getData();
    
        MergeObjectModel mergeObject = mergedObjectModelService.createMergeObjectModel(contractModel, macDTO, allInfoToCpeDTO);
        Field[] fieldList = mergeObject.getClass().getDeclaredFields();
    
        for (Field field : fieldList) {
            field.setAccessible(true);
            try {
                String fieldPropertyName = getJsonPropertyName(field);
                Object value = field.get(mergeObject);
    
                listComparisonPropertiesDTO.stream()
                    .flatMap(comparison -> comparison.getProperties().stream())
                    .filter(property -> fieldPropertyName.equalsIgnoreCase(property.getProperty()))
                    .forEach(property -> System.out.println(fieldPropertyName + " : " + value + " -|- " + property.getInput()));
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    

    public void printObjectField(Object object) {
        Field[] fieldList = object.getClass().getDeclaredFields();
        for (Field field : fieldList) {
            field.setAccessible(true);
            try {
                Object value = field.get(object);
                System.out.println(getJsonPropertyName(field) + " :" + value);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public NodeDetailDTO getNodeStart() {
        try {
            RootChartModel rootChartModel = getDataRootChart();
            List<NodeDetailDTO> listNodeDetail = rootChartModel.getData();
            Optional<NodeDetailDTO> startNode = listNodeDetail.stream()
                    .filter(node -> "Start".equals(node.getType()))
                    .flatMap(node -> node.getComparisonProperties().stream())
                    .map(ComparisonPropertiesDTO::getNext)
                    .flatMap(nextId -> listNodeDetail.stream().filter(node -> nextId.equals(node.getId())))
                    .findFirst();
            return startNode.orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ContractModel getContractModel() {
        return apiService.getMacFromContract().getMacContract().stream()
                .map(m -> {
                    int objID = m.getObjID();
                    List<ContractModel> listContractModel = apiService.getContractFromMac().getData();
                    return listContractModel.stream()
                            .filter(c -> c.getObjID() == objID)
                            .findFirst()
                            .orElse(null);
                })
                .findFirst()
                .orElse(null);
    }
    // public void addFieldObjectIntoMap(Object javaObject, Map mergedObjectMap) {
    // for (Field field : javaObject.getClass().getDeclaredFields()) {
    // field.setAccessible(true);

    // try {
    // String fieldJsonProperty = field.getAnnotation(JsonProperty.class).value();
    // Object currentValue = field.get(javaObject);
    // mergedObjectMap.put(fieldJsonProperty, currentValue);
    // } catch (IllegalArgumentException | IllegalAccessException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    public String getJsonPropertyName(Field field) {
        JsonProperty jsonPropertyAnnotation = field.getAnnotation(JsonProperty.class);
        if (jsonPropertyAnnotation != null && !jsonPropertyAnnotation.value().isEmpty()) {
            return jsonPropertyAnnotation.value();
        } else {
            return null;
        }
    }

}