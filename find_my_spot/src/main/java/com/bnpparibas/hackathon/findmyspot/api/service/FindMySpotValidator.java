package com.bnpparibas.hackathon.findmyspot.api.service;

import com.bnpparibas.hackathon.findmyspot.api.model.ParkingSlot;
import com.bnpparibas.hackathon.findmyspot.api.repository.ParkingSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bnpparibas.hackathon.employee.api.model.Employee;

import java.util.Optional;

@Service
public class FindMySpotValidator {
	
    public boolean existsEmployee(Long employeeId) {
    	ResponseEntity<Employee> employee = template.getForEntity("http://localhost:8080/employee/api/v1/employees/"+employeeId, Employee.class);
        return HttpStatus.OK.equals(employee.getStatusCode()) && employee.hasBody();
    }

    public boolean employeeIsInSpot(Long employeeId) {
        Optional<ParkingSlot> possibleEmployee = repository.findByEmployeeId(employeeId);
        return possibleEmployee.isPresent();
    }

    @Autowired
    public FindMySpotValidator(
            RestTemplate template,
            ParkingSlotRepository repository
    ) {
        this.template = template;
        this.repository = repository;
    }
    private final RestTemplate template;
    private final ParkingSlotRepository repository;
}
