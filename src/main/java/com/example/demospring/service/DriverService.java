package com.example.demospring.service;

import com.example.demospring.model.Driver;
import com.example.demospring.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverService {
    @Autowired
    private DriverRepository driverRepository;


    public List<Driver> getDrivers() {
        return driverRepository.getDrivers();
    }

    public List<Driver> addDriver(Driver p) {
        return driverRepository.addDriver(p);
    }

    public List<Driver> updateDriver(Driver p, int id) {
        return driverRepository.updateDriver(p, id);
    }

    public List<Driver> getDriverById(int id) {
        return driverRepository.getDriverById(id);
    }

    public List<Driver> deleteDriverById(int id) {
        return driverRepository.deleteDriverById(id);
    }
}
