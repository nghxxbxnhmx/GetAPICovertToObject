package com.ok_http.services;

import java.io.IOException;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.models.ContractResponse;
import com.ok_http.models.MacResponse;

import okhttp3.*;

@Service
public class GetAPIService {    
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public String getContractFromMac() throws IOException {
        String API_URL = "http://systemradiusapi.fpt.vn/api/Mo/GetContractInfoByMac";
        String selfPath = "http://localhost:8080/getFromMac";
        ObjectMapper objectMapper = new ObjectMapper();
        ContractResponse responseObject = new ContractResponse();

        RequestBody formBody = new FormBody.Builder()
                .add("MacAddress", "a4:81:7a:b1:05:92")
                .build();

        Request request = new Request.Builder()
                // .url(selfPath)
                .url(API_URL)
                .header("Content-Type", "application/json")
                .post(formBody)
                .build();

        try (Response response = new OkHttpClient().newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code: " + response);
            }
            String responseJsonString = response.body().string();
            responseObject = objectMapper.readValue(responseJsonString, ContractResponse.class);
            
            return responseObject.toJson();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getMacFromContract() throws IOException {
        String API_URL = "http://systemradiusapi.fpt.vn/api/Mo/GetMacByContract_ObjID";
        String selfPath = "http://localhost:8080/getFromContract";
        ObjectMapper objectMapper = new ObjectMapper();
        MacResponse macResponse = new MacResponse();

        RequestBody formBody = new FormBody.Builder()
                .add("contract", "SGFDN0092")
                .build();

        Request request = new Request.Builder()
                // .url(selfPath)
                .url(API_URL)
                .header("Content-Type", "application/json")
                .post(formBody)
                .build();

        try (Response response = new OkHttpClient().newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code: " + response);
            }
            String responseJsonString = response.body().string();
            macResponse = objectMapper.readValue(responseJsonString, MacResponse.class);
            
            return macResponse.toJson();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
