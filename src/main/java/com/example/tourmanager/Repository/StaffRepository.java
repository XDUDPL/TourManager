package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity,Long> {
}
