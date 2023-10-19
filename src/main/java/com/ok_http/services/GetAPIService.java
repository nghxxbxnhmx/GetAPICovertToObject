package com.ok_http.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ok_http.apiresponse.ContractResponse;
import com.ok_http.apiresponse.MacResponse;

@Service
public interface GetApiService {
    ResponseEntity<ContractResponse> getContractFromMac();
    ResponseEntity<MacResponse> getMacFromContract();
}
