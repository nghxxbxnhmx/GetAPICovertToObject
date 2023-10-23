package com.ok_http.services;

import org.springframework.stereotype.Service;

import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;

@Service
public interface GetApiService {
    ContractDTO getContractFromMac();
    MacDTO getMacFromContract();
    AllInfoToCpeDTO  getAllInfoToCPE();
}
