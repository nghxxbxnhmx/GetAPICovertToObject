package com.ok_http.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ok_http.models.MacContractModel;

import lombok.Data;

@Data
public class MacDTO {
    @JsonProperty("Status")
    String status;

    @JsonProperty("Amount")
    int amount;

    @JsonProperty("Code")
    int code;

    @JsonProperty("Description")
    int description;

    @JsonProperty("Data")
    List<MacContractModel> macContract;
    
    @JsonProperty("FunctionInfo")
    String functionInfo;
}
