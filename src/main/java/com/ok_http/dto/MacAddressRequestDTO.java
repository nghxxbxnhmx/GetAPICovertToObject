package com.ok_http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MacAddressRequestDTO {
    @JsonProperty("MacAddress")
    private String macAddress;

    public MacAddressRequestDTO(String macAddress) {
        this.macAddress = macAddress;
    }
}
