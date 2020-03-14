package com.bnpparibas.hackathon.findmyspot.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
public class FindMySpotValidator {

    public boolean existsEmployee(Long employeeId) {
        throw new RuntimeException("existsEmployee");
    }

    public boolean employeeIsInSpot(Long employeeId) {

        throw new RuntimeException("employeeIsInSpot");
    }

    @Autowired
    public FindMySpotValidator(RestTemplate template) {
        this.template = template;
    }
    private final RestTemplate template;
}
