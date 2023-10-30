package com.ok_http.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.dto.NodeDetailDTO;
import com.ok_http.models.RootChartModel;
import com.ok_http.services.GetApiService;
import com.ok_http.services.RootChartService;

@RestController
public class JobController {
    @Autowired
    GetApiService apiService;
    @Autowired
    RootChartService rootChartService;

    @PostMapping("/GetContractInfoByMac")
    public ResponseEntity<ContractDTO> getContractInfoByMac() {
        return ResponseEntity.ok(apiService.getContractFromMac());
    }

    @PostMapping("/GetMacByContract_ObjID")
    public ResponseEntity<MacDTO> getMacFromContract() {
        return ResponseEntity.ok(apiService.getMacFromContract());
    }

    @PostMapping("/getAllInfoToCPE")
    public ResponseEntity<AllInfoToCpeDTO> getAllInfoToCPE() {
        return ResponseEntity.ok(apiService.getAllInfoToCPE());
    }

    @PostMapping("/ReadDataRootChart")
    public String readDataRootChart() {
        return apiService.jsonCompare();
    }

    @PostMapping(value = "/GetDataRootChart")
    public ResponseEntity<List <NodeDetailDTO>> getDataRootChart() {
        return ResponseEntity.ok(rootChartService.getDataRootChart().getData());
    }
    
    @PostMapping("/GetStartId")
    public String hehe() {
        return rootChartService.process();
    }

}
