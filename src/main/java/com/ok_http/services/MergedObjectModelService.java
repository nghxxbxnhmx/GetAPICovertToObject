package com.ok_http.services;

import org.springframework.stereotype.Service;

import com.ok_http.dto.MacDTO;
import com.ok_http.models.ContractModel;
import com.ok_http.models.DeviceInfoModel;
import com.ok_http.models.MergeObjectModel;

@Service
public interface MergedObjectModelService {
    MergeObjectModel createMergeObjectModel(ContractModel contract, MacDTO mac, DeviceInfoModel deviceInfo);
}
