package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.ChiPhiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiPhiRepository extends JpaRepository<ChiPhiEntity,Long> {
}
