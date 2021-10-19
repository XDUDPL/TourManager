package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.ChiTietTourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietTourRepository extends JpaRepository<ChiTietTourEntity,Long> {
}
