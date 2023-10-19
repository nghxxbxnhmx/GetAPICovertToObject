package com.ok_http.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ok_http.models.ContractModel;

import lombok.Data;

@Data
public class ContractDTO {
    @JsonProperty("Status")
    String status;

    @JsonProperty("Amount")
    int amount;

    @JsonProperty("Code")
    int code;

    @JsonProperty("Data")
    List<ContractModel> data;

    @JsonProperty("Description")
    String description;

    @JsonProperty("FunctionInfo")
    String functionInfo;
}
