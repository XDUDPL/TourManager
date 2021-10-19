package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.GiaTourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiaTourRepository extends JpaRepository<GiaTourEntity,Long> {
}
