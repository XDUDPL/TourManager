package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.NhanVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVienEntity,Long> {
}
