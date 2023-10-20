package com.ok_http.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.ContractRequestDTO;
import com.ok_http.dto.MacAddressRequestDTO;
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
        MacAddressRequestDTO macAddressRequestDTO = new MacAddressRequestDTO("a4:81:7a:b1:05:92");
        try {
            return objectMapper.readValue(
                    okHttpUtil.postRequest(apiUrl, objectMapper.writeValueAsString(macAddressRequestDTO)),
                    ContractDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public MacDTO getMacFromContract() {
        String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetMacByContract_ObjID";
        ContractRequestDTO contractRequestDTO = new ContractRequestDTO("SGFDN0092");
        try {
            return objectMapper.readValue(
                    okHttpUtil.postRequest(apiUrl, objectMapper.writeValueAsString(contractRequestDTO)), MacDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
