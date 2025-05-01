package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Location;

import java.util.List;

public interface LocationService {
    List<Location> getAllLocations();
    Location getLocationById(Long id);
    Location saveLocation(Location location);
    Location updateLocation(Long id, Location location);
    void deleteLocationById(Long id);
}
