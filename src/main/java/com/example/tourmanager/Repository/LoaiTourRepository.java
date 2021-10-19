package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.LoaiTourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiTourRepository extends JpaRepository<LoaiTourEntity,Long> {
}
