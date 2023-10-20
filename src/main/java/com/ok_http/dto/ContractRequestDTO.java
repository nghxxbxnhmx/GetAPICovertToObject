package com.ok_http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ContractRequestDTO {
    @JsonProperty("contract")
    private String contract;

    public ContractRequestDTO(String contract) {
        this.contract = contract;
    }
}

