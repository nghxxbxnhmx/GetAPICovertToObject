package com.ok_http.dto.asc;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetContractFromMac {
    @JsonProperty("MacAddress")
    private String macAddress;

    public GetContractFromMac(String macAddress) {
        this.macAddress = macAddress;
    }
}
