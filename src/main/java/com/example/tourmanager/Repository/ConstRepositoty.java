package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.CostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstRepositoty extends JpaRepository<CostEntity,Long> {
}
