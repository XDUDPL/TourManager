package com.example.tourmanager.Repository;

import com.example.tourmanager.Entity.KhachHangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHangEntity,Long> {
}
