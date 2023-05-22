package com.assignment.repository;

import com.assignment.entity.ChiTietSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(ChiTietSanPhamRepository.NAME)
public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham, Long> {
    public static final String NAME = "BaseChiTietSanPhamRepository";
}
