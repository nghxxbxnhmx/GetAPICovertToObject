package com.ok_http.models;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MacResponse {
    @JsonProperty("Status")
    String status;

    @JsonProperty("Amount")
    int amount;

    @JsonProperty("Code")
    int code;

    @JsonProperty("Description")
    int description;

    @JsonProperty("Data")
    List<Mac_Contract> Mac_Contract;
    
    @JsonProperty("FunctionInfo")
    String functionInfo;

    public String toJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
