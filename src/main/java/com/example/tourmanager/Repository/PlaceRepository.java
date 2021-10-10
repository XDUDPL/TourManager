package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity,Long> {
}
