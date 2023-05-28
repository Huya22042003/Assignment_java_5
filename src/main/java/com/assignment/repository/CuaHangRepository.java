package com.assignment.repository;

import com.assignment.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CuaHangRepository.NAME)
public interface CuaHangRepository extends JpaRepository<CuaHang, Long> {
    public static final String NAME = "BaseCuaHangRepository";
}
