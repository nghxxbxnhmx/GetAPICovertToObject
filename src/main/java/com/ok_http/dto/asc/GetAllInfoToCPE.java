package com.ok_http.dto.asc;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAllInfoToCPE {
    @JsonProperty("mac")
    private String mac;

    public GetAllInfoToCPE(String mac) {
        this.mac = mac;
    }
}
