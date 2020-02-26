package com.bnpparibas.hackathon.parking.api.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnpparibas.hackathon.parking.api.controller.ParkingControllerAPI;

@RestController
@RequestMapping("/api/v1")
public abstract class ParkingController implements ParkingControllerAPI{

	//TODO Remove abstract keyword and implement methods
}
