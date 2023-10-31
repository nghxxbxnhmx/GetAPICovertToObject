package com.ok_http.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.dto.asc.GetMacFromContract;
import com.ok_http.dto.asc.GetContractFromMac;
import com.ok_http.dto.asc.GetAllInfoToCPE;
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

        // try {
        // return objectMapper.readValue(new String(
        // Files.readAllBytes(Paths.get("src\\main\\resources\\static\\store\\GetContractInfoByMac.json")),
        // StandardCharsets.UTF_8), ContractDTO.class);
        // } catch (Exception e) {
        // e.printStackTrace();
        // return null;
        // }
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

        // try {
        // return objectMapper.readValue(new String(
        // Files.readAllBytes(Paths.get("src\\main\\resources\\static\\store\\GetMacByContract_ObjID.json")),
        // StandardCharsets.UTF_8), MacDTO.class);
        // } catch (Exception e) {
        // e.printStackTrace();
        // return null;
        // }
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

        // try {
        // return objectMapper.readValue(new String(
        // Files.readAllBytes(Paths.get("src\\main\\resources\\static\\store\\getAllInfoToCPE.json")),
        // StandardCharsets.UTF_8), AllInfoToCpeDTO.class);
        // } catch (Exception e) {
        // e.printStackTrace();
        // return null;
        // }
    }
}
