package com.ok_http.services;

import java.io.IOException;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ok_http.models.ContractResponse;

import okhttp3.*;

@Service
public class GetAPIService {
    public static final String API_URL = "http://systemradiusapi.fpt.vn/api/Mo/GetContractInfoByMac";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public String getObjectFromResponse() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ContractResponse responseObject = new ContractResponse();

        RequestBody formBody = new FormBody.Builder()
                .add("MacAddress", "a4:81:7a:b1:05:92")
                .build();

        Request request = new Request.Builder()
                .url(API_URL)
                .header("Content-Type", "application/json")
                // .post(formBody)
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
    
}
