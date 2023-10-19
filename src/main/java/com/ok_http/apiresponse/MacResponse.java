package com.ok_http.apiresponse;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ok_http.models.MacContract;

import lombok.Data;

@Data
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
    List<MacContract> macContract;
    
    @JsonProperty("FunctionInfo")
    String functionInfo;
}
