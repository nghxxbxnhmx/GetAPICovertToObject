package com.ok_http.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ok_http.apiresponse.ContractResponse;
import com.ok_http.apiresponse.MacResponse;
import com.ok_http.services.GetApiService;
import com.ok_http.utils.OkHttpUtil;

import okhttp3.*;
@Service
public class GetApiServiceImpl implements GetApiService {
    @Autowired
    OkHttpUtil okHttpUtil;

    @Override
    public ResponseEntity<ContractResponse> getContractFromMac(){
        try {
            String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetContractInfoByMac";
            RequestBody formBody = new FormBody.Builder()
                    .add("MacAddress", "a4:81:7a:b1:05:92")
                    .build();
            return ResponseEntity.ok(okHttpUtil.executePostRequest(apiUrl, formBody, ContractResponse.class));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public ResponseEntity<MacResponse> getMacFromContract() {
        try {
            String apiUrl = "http://systemradiusapi.fpt.vn/api/Mo/GetMacByContract_ObjID";
            RequestBody formBody = new FormBody.Builder()
                    .add("contract", "SGFDN0092")
                    .build();
            return ResponseEntity.ok(okHttpUtil.executePostRequest(apiUrl, formBody, MacResponse.class));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
