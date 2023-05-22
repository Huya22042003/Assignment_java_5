package com.assignment.repository;

import com.assignment.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(SanPhamRepository.NAME)
public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
    public static final String NAME = "BaseSanPhamRepository";

}
