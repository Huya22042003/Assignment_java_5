package com.assignment.repository;

import com.assignment.entity.ChiTietAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(ChiTietAnhRepository.NAME)
public interface ChiTietAnhRepository extends JpaRepository<ChiTietAnh, Long> {
    public static final String NAME = "BaseChiTietAnhRepository";
}
