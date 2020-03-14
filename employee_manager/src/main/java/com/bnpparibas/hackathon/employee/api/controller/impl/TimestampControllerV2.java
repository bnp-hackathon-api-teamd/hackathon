package com.bnpparibas.hackathon.employee.api.controller.impl;

import com.bnpparibas.hackathon.employee.api.controller.TimestampControllerAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class TimestampControllerV2 implements TimestampControllerAPI {


    @GetMapping()
    public String getCurrentTimestamp() {
        final Long currentTimeStamp = System.currentTimeMillis();
        return currentTimeStamp.toString();
    }


}
