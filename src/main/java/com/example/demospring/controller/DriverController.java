package com.example.demospring.controller;


import com.example.demospring.model.Driver;
import com.example.demospring.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;


    @GetMapping("/get")
    public List<Driver> getDrivers(Model model) {
        return driverService.getDrivers();
    }

    @PostMapping("/add")
    public List<Driver> addDriver(@RequestBody @Valid Driver p) {
        return driverService.addDriver(p);
    }

    @PutMapping("/update")
    public List<Driver> updateDriver(@RequestBody @Valid Driver p, @RequestParam int id) {
        return driverService.updateDriver(p, id);
    }

    @GetMapping("/getById")
    public List<Driver> getDriverById(@RequestParam int id) {

        return driverService.getDriverById(id);

    }

    @DeleteMapping("/delete")
    public List<Driver> deleteDriverById(@RequestParam int id) {
        return driverService.deleteDriverById(id);
    }
}
