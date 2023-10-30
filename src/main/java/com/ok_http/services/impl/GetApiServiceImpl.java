package com.ok_http.services.impl;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.dto.asc.GetMacFromContract;
import com.ok_http.models.DeviceInfoModel;
import com.ok_http.models.RootChartModel;
import com.ok_http.dto.asc.GetContractFromMac;
import com.ok_http.dto.asc.GetAllInfoToCPE;
import com.ok_http.services.GetApiService;
import com.ok_http.utils.JsonCompareUtil;
import com.ok_http.utils.JsonUtil;
import com.ok_http.utils.OkHttpUtil;

@Service
public class GetApiServiceImpl implements GetApiService {
    @Autowired
    OkHttpUtil okHttpUtil;
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ContractDTO getContractFromMac() {
        String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetContractInfoByMac";
        GetContractFromMac macAddressRequestDTO = new GetContractFromMac("a4:81:7a:b1:05:92");
        try {
            return objectMapper.readValue(
                    okHttpUtil.postRequest(apiUrl,
                            objectMapper.writeValueAsString(macAddressRequestDTO)),
                    ContractDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public MacDTO getMacFromContract() {
        String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetMacByContract_ObjID";
        GetMacFromContract contractRequestDTO = new GetMacFromContract("SGFDN0092");
        try {
            return objectMapper.readValue(
                    okHttpUtil.postRequest(apiUrl,
                            objectMapper.writeValueAsString(contractRequestDTO)),
                    MacDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public AllInfoToCpeDTO getAllInfoToCPE() {
        String apiUrl = "http://acs2.fpt.net/api/bpm/getparametervalues/GetAllInfoToCPE";
        GetAllInfoToCPE macRequestDTO = new GetAllInfoToCPE("a4:81:7a:b1:05:92");
        try {
            return objectMapper.readValue(
                    okHttpUtil.postRequest("PHPSESSID=e1a3b61cb1c31518626e597c408ee0b9", apiUrl,
                            objectMapper.writeValueAsString(macRequestDTO)),
                    AllInfoToCpeDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String jsonCompare() {
        String url = "src\\main\\resources\\static\\store\\data-rootchart.json";
        ContractDTO contractDTO = getContractFromMac();
        MacDTO macDTO = getMacFromContract();
        DeviceInfoModel deviceInfoModel = getAllInfoToCPE().getData();

        JsonCompareUtil.compareObjectsWithJson(contractDTO, url);
        JsonCompareUtil.compareObjectsWithJson(macDTO, url);
        JsonCompareUtil.compareObjectsWithJson(deviceInfoModel, url);
        return "Okay";
    }
}
