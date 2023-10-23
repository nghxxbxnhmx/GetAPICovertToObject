package com.ok_http.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.services.GetApiService;

@RestController
public class GetResponseFromAPIController {
    @Autowired
    GetApiService apiService;

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
}
