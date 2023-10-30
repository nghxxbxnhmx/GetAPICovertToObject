package com.ok_http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScenarioBranchDTO {
    @JsonProperty("enable")
    boolean enable;

    @JsonProperty("id")
    int id;

}
