package com.ok_http.utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class OkHttpUtil {
    private static final String CONTENT_TYPE_JSON = "application/json";

    private final ObjectMapper objectMapper;
    private final OkHttpClient okHttpClient;

    public OkHttpUtil() {
        this.objectMapper = new ObjectMapper();
        this.okHttpClient = new OkHttpClient();
    }

    public <T> T executePostRequest(String url, RequestBody requestBody, Class<T> responseClass) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .header("Content-Type", CONTENT_TYPE_JSON)
                .post(requestBody)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code: " + response);
            }
            String responseJsonString = response.body().string();
            return objectMapper.readValue(responseJsonString, responseClass);
        }
    }
}
