package com.bnpparibas.hackathon.findmyspot.api.repository;

import com.bnpparibas.hackathon.findmyspot.api.model.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {
    @Query("Select P from ParkingSlot P where P.employeeId = :employeeId")
    Optional<ParkingSlot> findByEmployeeId(@Param("employeeId") Long employeeId);
}
