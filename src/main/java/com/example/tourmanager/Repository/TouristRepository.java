package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.TouristEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristRepository extends JpaRepository<TouristEntity,Long> {
}
