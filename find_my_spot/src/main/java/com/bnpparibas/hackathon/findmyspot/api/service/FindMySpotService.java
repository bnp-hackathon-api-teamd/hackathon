package com.bnpparibas.hackathon.findmyspot.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class FindMySpotService {
    private final RestTemplate restTemplate;

    public void leavePark(Long employeeId) {

        String uriParkSlot ="";
        ResponseEntity<Map> retorno = restTemplate.getForEntity(uriParkSlot, Map.class);

    }

    @Autowired
    public FindMySpotService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
