package com.ok_http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DetailComparisonDTO {
    @JsonProperty("property")
    private String property;

    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private String value;

    @JsonProperty("input")
    private String input;

    @JsonProperty("comparison")
    private int comparison;

    @JsonProperty("gate")
    private String gate;

    @JsonProperty("name")
    private String name;
}

