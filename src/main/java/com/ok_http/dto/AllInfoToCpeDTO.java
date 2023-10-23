package com.ok_http.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ok_http.models.DeviceInfoModel;

import lombok.Data;

@Data
public class AllInfoToCpeDTO {
    @JsonProperty("code")
    private int code;

    @JsonProperty("amount")
    private int amount;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private DeviceInfoModel data;

}
