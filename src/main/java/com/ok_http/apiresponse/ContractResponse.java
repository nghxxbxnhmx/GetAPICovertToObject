package com.ok_http.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ok_http.models.Contract;

import lombok.Data;

@Data
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
}
