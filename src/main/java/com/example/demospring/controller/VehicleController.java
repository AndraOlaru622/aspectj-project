package com.example.demospring.controller;

import com.example.demospring.model.Vehicle;
import com.example.demospring.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;


    @GetMapping("/get")
    public List<Vehicle> getVehicle() {
        return vehicleService.getVehicles();
    }

    @PostMapping("/add")
    public List<Vehicle> addVehicle(@RequestBody @Valid Vehicle p) {
        return vehicleService.addVehicle(p);
    }

    @DeleteMapping("/delete")
    public List<Vehicle> deleteVehicleById(@RequestParam int id) {
        return vehicleService.deleteVehicleById(id);
    }
}
