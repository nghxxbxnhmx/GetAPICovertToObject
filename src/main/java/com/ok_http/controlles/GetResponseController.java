package com.ok_http.controlles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetResponseController {
    public String motherPath = "src\\main\\resources\\static\\";

    // đọc file json trả về response
    @PostMapping("/getFromMac")
    public ResponseEntity<String> getFromMac() throws FileNotFoundException {
        String path = motherPath+"GetContractInfoByMac.json";
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

    @PostMapping("/getFromContract")
    public ResponseEntity<String> getFromContract() throws FileNotFoundException {
        String path = motherPath+"GetMacByContract_ObjID.json";
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
