package com.ok_http.controlles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ok_http.services.GetAPIService;

@RestController
public class GetResponseFromAPIController {
    @Autowired GetAPIService apiService;


    @PostMapping(value = "/GetContractInfoByMac")
    public String GetContractInfoByMac() throws IOException {
        return apiService.getObjectFromResponse();
    }


    // đọc file json trả về response
    @PostMapping("/hehe2")
    public ResponseEntity<String> returnJsonString() throws FileNotFoundException {
        String path = "C:\\Java Workspace\\FTEL PROJECT\\ok_http\\src\\main\\resources\\static\\GetContractInfoByMac.json";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return ResponseEntity.ok(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Internal Server Error");
        }
    }
}
