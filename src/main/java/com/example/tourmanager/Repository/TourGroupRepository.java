package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.TourGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourGroupRepository extends JpaRepository<TourGroupEntity, Long> {
}
