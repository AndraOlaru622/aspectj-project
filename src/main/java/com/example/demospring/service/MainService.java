package com.example.demospring.service;

import com.example.demospring.model.DriverLocation;
import com.example.demospring.model.DriverVehicle;
import com.example.demospring.model.LinePrice;
import com.example.demospring.model.VehicleLine;
import com.example.demospring.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private MainRepository mainRepository;


    public List<DriverLocation> getDriverLocation() {
        return mainRepository.getDriverLocations();
    }

    public List<DriverVehicle> getDriverVehicle() {
        return mainRepository.getDriverVehicles();
    }

    public List<VehicleLine> getVehicleLine() {
        return mainRepository.getVehicleLines();
    }

    public List<LinePrice> getLinePrice() {
        return mainRepository.getLinesPrice();
    }
}
