package com.bnpparibas.hackathon.findmyspot.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bnpparibas.hackathon.employee.api.model.Employee;

@Service
public class FindMySpotValidator {
	
    public boolean existsEmployee(Long employeeId) {
    	ResponseEntity<Employee> employee = template.getForEntity("http://localhost:8080/employee/api/v1/employees/"+employeeId, Employee.class);
    	if(employee != null) {
    		return true;	
    	}
    	return false;
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
