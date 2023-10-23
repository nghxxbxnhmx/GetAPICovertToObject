package com.ok_http.dto.asc;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetMacFromContract{
    @JsonProperty("contract")
    private String contract;

    public GetMacFromContract(String contract) {
        this.contract = contract;
    }
}

