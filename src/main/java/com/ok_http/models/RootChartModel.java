package com.ok_http.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ok_http.dto.NodeDetailDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RootChartModel {
    @JsonProperty("chartId")
    String chartId;

    @JsonProperty("data")
    List<NodeDetailDTO> data;

    @JsonProperty("contract")
    String contract;

    @JsonProperty("mac")
    String mac;

    @JsonProperty("objId")
    int objId;

    @JsonProperty("sender_id")
    String senderId;

    @JsonProperty("queue")
    String queue;
}
