package com.edumarketplace.backend.repository;

import com.edumarketplace.backend.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository <Location, Long> {
}
