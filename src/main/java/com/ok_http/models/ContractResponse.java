package com.ok_http.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractResponse {
    @JsonProperty("Status")
    String status;

    @JsonProperty("Amount")
    int amount;

    @JsonProperty("Code")
    int code;

    @JsonProperty("Data")
    List<Contract> data;

    @JsonProperty("Description")
    String description;

    @JsonProperty("FunctionInfo")
    String functionInfo;

    @Override
    public String toString() {
        return "ResponseObject{" +
                "status='" + status + '\'' +
                ", amount=" + amount +
                ", code=" + code +
                ", description='" + description + '\'' +
                ", data=" + data +
                ", functionInfo='" + functionInfo + '\'' +
                '}';
    }
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
