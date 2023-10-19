package com.ok_http.controlles;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ok_http.services.GetAPIService;

@RestController
public class GetResponseFromAPIController {
    @Autowired GetAPIService apiService;


    @PostMapping("/GetContractInfoByMac")
    public String GetContractInfoByMac() throws IOException {
        return apiService.getContractFromMac();
    }

    @PostMapping("/GetMacByContract_ObjID")
    public String GetMacFromContract() throws IOException {
        return apiService.getMacFromContract();
    }
}
