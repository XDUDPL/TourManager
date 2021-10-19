package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.NguoiDiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDiRepository extends JpaRepository<NguoiDiEntity,Long> {
}
