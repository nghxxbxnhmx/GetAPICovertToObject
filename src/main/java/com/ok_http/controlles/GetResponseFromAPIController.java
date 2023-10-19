package com.ok_http.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ok_http.apiresponse.ContractResponse;
import com.ok_http.apiresponse.MacResponse;
import com.ok_http.services.GetApiService;

@RestController
public class GetResponseFromAPIController {
    @Autowired
    GetApiService apiService;

    @PostMapping("/GetContractInfoByMac")
    public ResponseEntity<ContractResponse> getContractInfoByMac() {
        return apiService.getContractFromMac();
    }

    @PostMapping("/GetMacByContract_ObjID")
    public ResponseEntity<MacResponse> getMacFromContract() {
        return apiService.getMacFromContract();
    }
}
