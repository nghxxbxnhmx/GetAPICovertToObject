package com.ok_http.services;

import org.springframework.stereotype.Service;

import com.ok_http.dto.AllInfoToCpeDTO;
import com.ok_http.dto.ContractDTO;
import com.ok_http.dto.MacDTO;
import com.ok_http.models.RootChartModel;

@Service
public interface GetApiService {
    ContractDTO getContractFromMac();
    MacDTO getMacFromContract();
    AllInfoToCpeDTO  getAllInfoToCPE();
    String jsonCompare();
}
