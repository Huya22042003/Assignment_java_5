package com.assignment.repository;

import com.assignment.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(KhachHangRepository.NAME)
public interface KhachHangRepository extends JpaRepository<KhachHang, Long> {
    public static final String NAME = "BaseKhachHangRepository";

}
