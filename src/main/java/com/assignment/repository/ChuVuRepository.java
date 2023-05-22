package com.assignment.repository;

import com.assignment.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(ChuVuRepository.NAME)
public interface ChuVuRepository extends JpaRepository<ChucVu, Long> {
    public static final String NAME = "BaseChuVuRepository";
}
