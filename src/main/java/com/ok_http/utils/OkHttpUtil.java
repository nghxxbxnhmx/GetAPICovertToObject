package com.ok_http.utils;

import okhttp3.*;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OkHttpUtil {
    private static final String CONTENT_TYPE_JSON = "application/json";
    MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");

    @Autowired
    OkHttpClient okHttpClient;
    
    public String postRequest(String url, String json) {
        try {
            RequestBody requestBody = RequestBody.create(json, jsonMediaType);
            Request request = new Request.Builder()
                    .url(url)
                    .header("Content-Type", CONTENT_TYPE_JSON)
                    .post(requestBody)
                    .build();
            try (Response response = okHttpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code: " + response);
                }
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String postRequest(String cookie, String url, String json) {
        try {
            RequestBody requestBody = RequestBody.create(json, jsonMediaType);
            Request request = new Request.Builder()
                    .url(url)
                    .header("Content-Type", CONTENT_TYPE_JSON)
                    .header( "Cookie", cookie)
                    .post(requestBody)
                    .build();
            try (Response response = okHttpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code: " + response);
                }
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}