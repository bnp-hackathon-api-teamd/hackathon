package com.bnpparibas.hackathon.findmyspot.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long employeeId;

    private Long parkId;


    public ParkingSlot() {
        this(null, null, null);
    }

    public ParkingSlot(Long id, Long employeeId, Long parkId) {
        this.id = id;
        this.employeeId = employeeId;
        this.parkId = parkId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getParkId() {
        return parkId;
    }

    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }
}
