package com.ok_http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MacContract {
    @JsonProperty("MACAddress")
    String macAddress;

    @JsonProperty("ObjID")
    int objID;
}
