package com.assignment.repository;

import com.assignment.entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(GioHangRepository.NAME)
public interface GioHangRepository extends JpaRepository<GioHang, Long> {
    public static final String NAME = "BaseGioHangRepository";
}
