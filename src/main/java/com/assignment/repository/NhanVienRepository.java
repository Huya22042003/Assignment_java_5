package com.assignment.repository;

import com.assignment.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(NhanVienRepository.NAME)
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
    public static final String NAME = "BaseNhanVienRepository";

}
