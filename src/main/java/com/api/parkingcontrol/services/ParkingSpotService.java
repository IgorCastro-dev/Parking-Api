package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class ParkingSpotService {
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	@Transactional
	public Object save(@Valid ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}

	public boolean existsByLicensePlateCar(String licensePlateCar) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartmentAndBlock(String apartment, String block) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.existsByApartmentAndBlock(apartment,block);
	}

	public List<ParkingSpotModel> findAll() {
		// TODO Auto-generated method stub
		return parkingSpotRepository.findAll();
	}

	public Optional<ParkingSpotModel> findById(UUID id) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.findById(id);
	}
}
