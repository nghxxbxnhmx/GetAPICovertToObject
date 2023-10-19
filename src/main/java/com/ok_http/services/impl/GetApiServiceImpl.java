package com.ok_http.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.services.GetApiService;
import com.ok_http.utils.OkHttpUtil;

@Service
public class GetApiServiceImpl implements GetApiService {
    @Autowired
    OkHttpUtil okHttpUtil;
    
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ContractDTO getContractFromMac() {
        String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetContractInfoByMac";
        String requestBody = "{\r\n" + //
                "    \"MacAddress\":\"a4:81:7a:b1:05:92\"\r\n" + //
                "}";
        try {
            return objectMapper.readValue(okHttpUtil.postRequest(apiUrl, requestBody), ContractDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public MacDTO getMacFromContract() {
        String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetMacByContract_ObjID";
        String requestBody = "{\r\n" + //
                "    \"contract\":\"SGFDN0092\"\r\n" + //
                "}";
        try {
            return objectMapper.readValue(okHttpUtil.postRequest(apiUrl, requestBody), MacDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
