package com.bnpparibas.hackathon.findmyspot.api.service;

import com.bnpparibas.hackathon.findmyspot.api.model.ParkingSlot;
import com.bnpparibas.hackathon.findmyspot.api.repository.ParkingSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

@Service
public class FindMySpotService {

    public void leavePark(Long employeeId, Long parkId) {
        Optional<ParkingSlot> parking = repository.findByEmployeeIdAndParkId(employeeId, parkId);
        ParkingSlot ps = parking.orElseThrow(() -> new RuntimeException("Not found"));
        repository.delete(ps);

        final String url ="";
//        restTemplate.postForEntity(url, ps.getParkId());
    }


    public void enterPark(Long employeeId, Long parkId) {
        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.setEmployeeId(employeeId);
        parkingSlot.setParkId(parkId);
        final String url ="";
        repository.save(parkingSlot);

        final String url ="";
//        restTemplate.postForEntity(url, parkingSlot):
    }

    @Autowired
    public FindMySpotService(RestTemplate restTemplate, ParkingSlotRepository repository) {
        this.restTemplate = restTemplate;
        this.repository = repository;
    }
    
    private final RestTemplate restTemplate;
    private final ParkingSlotRepository repository;
}
