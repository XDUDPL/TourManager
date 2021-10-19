package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.DiaDiemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaDiemRepository extends JpaRepository<DiaDiemEntity,Long> {
}
