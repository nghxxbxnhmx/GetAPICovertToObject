package com.ok_http.services.impl;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.dto.ComparisonPropertiesDTO;
import com.ok_http.dto.DetailComparisonDTO;
import com.ok_http.dto.NodeDetailDTO;
import com.ok_http.enums.ComparisonTypeEnum;
import com.ok_http.models.ContractModel;
import com.ok_http.models.MergeObjectModel;
import com.ok_http.models.RootChartModel;
import com.ok_http.services.GetApiService;
import com.ok_http.services.MergedObjectModelService;
import com.ok_http.services.RootChartService;
import com.ok_http.services.TreeBooleanEvaluator;

import org.json.JSONObject;

@Service
public class RootChartServiceImpl implements RootChartService {
    @Autowired
    GetApiService apiService;
    @Autowired
    MergedObjectModelService mergedObjectModelService;

    ObjectMapper objectMapper = new ObjectMapper();
    TreeBooleanEvaluator evaluateExpression = new TreeBooleanEvaluator();
    private boolean result;

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
        MergeObjectModel mergeObject = mergedObjectModelService.createMergeObjectModel(
                getContractModel(),
                apiService.getMacFromContract(),
                apiService.getAllInfoToCPE().getData());

        try {
            JSONObject mergeObjJson = new JSONObject(objectMapper.writeValueAsString(mergeObject));
            for (ComparisonPropertiesDTO comparisonProperty : listComparisonPropertiesDTO) {
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                String expression = "";
                boolean overallResult = true;
                for (DetailComparisonDTO property : comparisonProperty.getProperties()) {
                    String valueMergeObjJson = null;
                    if ("number".equals(property.getType())) {
                        valueMergeObjJson = mergeObjJson.optString(property.getProperty(), "0");
                    }
                    // if ("Code".equals(property.getProperty()) &&
                    // "40".equals(property.getInput())) {
                    // valueMergeObjJson = property.getInput();
                    // }
                    if (valueMergeObjJson != null) {
                        switch (property.getProperty()) {
                            case "DeviceInfo.UpTime": {
                                valueMergeObjJson = parseDurationToMillis(valueMergeObjJson) + "";
                                break;
                            }
                            case "CPUUsage":
                            case "Memory": {
                                valueMergeObjJson = valueMergeObjJson.replace("%", "");
                                break;
                            }
                        }

                        boolean propertyResult = compare(valueMergeObjJson, property.getInput(),
                                property.getType(),
                                property.getComparison() + "");
                        // System.out.println(
                        // valueMergeObjJson + " " +
                        // ComparisonTypeEnum.getValueByCode(property.getComparison())
                        // + " "
                        // + property.getInput() + " - " + propertyResult);

                        System.out.println(
                                valueMergeObjJson + " _ "
                                        + property.getInput() + " - " + property.getType());

                        expression = getExpression(propertyResult, property.getGate(), expression);
                    } else {
                        expression = "F";
                        break;
                    }
                }

                overallResult = evaluateExpression.evaluate(expression).equals("T") ? true : false;
                System.out.println("Expression: " + expression + " - " + overallResult);
                if (overallResult)
                    return comparisonProperty.getCondition();
            }

            return "Not found any issues";
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error!";
        }
    }

    public static String getExpression(boolean parameter, String gate, String expression) {
        String parameterString = parameter ? "T" : "F";
        parameterString = !parameterString.isBlank() & parameterString != null ? parameterString + " " : "";
        gate = gate != null ? gate + " " : "";
        expression = expression + parameterString + gate;
        return expression;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean booleanValue) {
        result = booleanValue;
    }

    public boolean compare(String value1, String value2, String type, String comparison) {
        if (type != null) {
            switch (type) {
                case "String": {
                    switch (comparison) {
                        case "0":
                            return value1.equals(value2);
                        case "1":
                            return !value1.equals(value2);
                    }
                    return false;
                }
                case "number": {
                    double numValue1 = Double.parseDouble(value1);
                    double numValue2 = Double.parseDouble(value2);

                    switch (comparison) {
                        case "0":
                            return numValue1 == numValue2;
                        case "1":
                            return numValue1 != numValue2;
                        case "2":
                            return numValue1 < numValue2;
                        case "3":
                            return numValue1 <= numValue2;
                        case "4":
                            return numValue1 > numValue2;
                        case "5":
                            return numValue1 >= numValue2;
                    }
                    return false;
                }
            }
        }
        return false;
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

    public static long parseDurationToMillis(String duration) {
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd 'days' H'h'mm'm'ss's'");
            Date date = dateFormatter.parse(duration);
            return date.getTime() / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

}