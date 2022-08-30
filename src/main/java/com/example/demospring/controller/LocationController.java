package com.example.demospring.controller;

import com.example.demospring.model.Location;
import com.example.demospring.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;


    @GetMapping("/get")
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @PostMapping("/add")
    public List<Location> addLocation(@RequestBody @Valid Location p) {
        return locationService.addLocation(p);
    }

    @DeleteMapping("/delete")
    public List<Location> deleteLocationById(@RequestParam int id) {
        return locationService.deleteLocationById(id);
    }
}
