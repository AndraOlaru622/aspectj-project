package com.example.demospring.controller;

import com.example.demospring.model.DriverLocation;
import com.example.demospring.model.DriverVehicle;
import com.example.demospring.model.LinePrice;
import com.example.demospring.model.VehicleLine;
import com.example.demospring.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    private MainService mainService;


    @GetMapping("/getDriverLocation")
    public List<DriverLocation> getDriverLocation() {
        return mainService.getDriverLocation();
    }

    @GetMapping("/getDriverVehicle")
    public List<DriverVehicle> getDriverVehicle() {
        return mainService.getDriverVehicle();
    }

    @GetMapping("/getVehicleLine")
    public List<VehicleLine> getVehicleLine() {
        return mainService.getVehicleLine();
    }

    @GetMapping("/getLinePrice")
    public List<LinePrice> getLinePrice() {
        return mainService.getLinePrice();
    }
}
