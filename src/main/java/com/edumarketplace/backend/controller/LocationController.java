package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Location;
import com.edumarketplace.backend.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class LocationController {

    private LocationService locationService;

    @Autowired
    public LocationController (LocationService locationService){
        this.locationService = locationService;
    }

    @PostMapping("/location")
    public Location saveLocation(Location location){
        return locationService.saveLocation(location);
    }
}
