package com.bnpparibas.hackathon.findmyspot.api.controller.impl;

import com.bnpparibas.hackathon.findmyspot.api.controller.FindMySpotControllerAPI;
import com.bnpparibas.hackathon.findmyspot.api.service.FindMySpotService;
import com.bnpparibas.hackathon.findmyspot.api.service.FindMySpotValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class FindMySpotController implements FindMySpotControllerAPI {

    /*TODO Create API that answers to the following needs:
     *  - Assigns a user to an available parking lot in a specific building
     *  - Informs to a user where is his assigned parking lot or if the user doesn't have any assigned park
     *  - When the user enters in the building it marks the parking lot as occupied
     *  - When the user leaves the building it marks the parking lot as free
     */

    @Override
    @PostMapping("/leave/{employeeId}")
    public ResponseEntity<?> leave(Long employeeId) {
        if(!validator.existsEmployee(employeeId)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        if(!validator.employeeIsInSpot(employeeId)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }


        return null;
    }

    @Override
    @PostMapping("/enter/{employeeId}")
    public ResponseEntity<?> enter(Long employeeId) {
        if(!validator.existsEmployee(employeeId)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return null;
    }

    @Autowired
    public FindMySpotController(
            FindMySpotValidator validator,
            FindMySpotService service
    ) {
        this.validator = validator;
        this.service = service;
    }

    private final FindMySpotValidator validator;
    private final FindMySpotService service;
}
