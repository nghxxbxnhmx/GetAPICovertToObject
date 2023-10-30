package com.ok_http.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ComparisonPropertiesDTO {
    @JsonProperty("next")
    private String next;

    @JsonProperty("properties")
    private ArrayList<DetailComparisonDTO> properties;

    @JsonProperty("scenarioBranch")
    private ScenarioBranchDTO scenarioBranch;

    @JsonProperty("condition")
    private String condition;

    @JsonProperty("result")
    private ArrayList<String> result;

}
