package com.bnpparibas.hackathon.findmyspot.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FindMySpotService {
    private final RestTemplate restTemplate;

    public void leavePark(Long employeeId) {

    }

    @Autowired
    public FindMySpotService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
