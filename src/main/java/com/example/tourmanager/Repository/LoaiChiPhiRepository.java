package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.LoaiChiPhiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiChiPhiRepository extends JpaRepository<LoaiChiPhiEntity,Long> {
}
