package com.assignment.repository;

import com.assignment.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(CuaHanRepository.NAME)
public interface CuaHanRepository extends JpaRepository<CuaHang, Long> {
    public static final String NAME = "BaseCuaHangRepository";
}
