package com.ok_http.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeDetailDTO {
    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("serviceName")
    private String serviceName;

    @JsonProperty("serviceAlias")
    private String serviceAlias;

    @JsonProperty("descriptions")
    private List<DescriptionsDTO> descriptions;

    @JsonProperty("comparison_properties")
    private ArrayList<ComparisonPropertiesDTO> comparisonProperties;

    @JsonProperty("input_properties")
    private ArrayList<InputPropertiesDTO> inputProperties;
}
