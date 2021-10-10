package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<TourEntity,Long> {
}
