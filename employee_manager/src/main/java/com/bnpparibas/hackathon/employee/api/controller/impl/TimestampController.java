package com.bnpparibas.hackathon.findmyspot.api.controller.impl;

import com.bnpparibas.hackathon.findmyspot.api.controller.TimestampControllerAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TimestampController implements TimestampControllerAPI {


    @GetMapping()
    public String getCurrentTimestamp() {
        final Long currentTimeStamp = System.currentTimeMillis();
        return currentTimeStamp.toString();
    }


}
