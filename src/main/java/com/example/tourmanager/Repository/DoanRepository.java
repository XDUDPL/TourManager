package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.DoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoanRepository extends JpaRepository<DoanEntity,Long> {
}
