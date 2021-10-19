package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<TourEntity,Long> {
}
