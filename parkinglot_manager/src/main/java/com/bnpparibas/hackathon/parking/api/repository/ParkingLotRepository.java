package com.bnpparibas.hackathon.parking.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bnpparibas.hackathon.parking.api.model.ParkingLot;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {

}