package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    Boolean existsByLicensePlateCar(String licensePlateCar);
    Boolean existsByParkingSpotNumber(String parkingSpotNumber);
    Boolean existsByApartmentAndBlock(String apartment, String block);
}