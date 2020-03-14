package com.bnpparibas.hackathon.findmyspot.api.repository;

import com.bnpparibas.hackathon.findmyspot.api.model.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {

}
