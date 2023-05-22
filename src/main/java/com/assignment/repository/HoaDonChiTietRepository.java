package com.assignment.repository;

import com.assignment.entity.HoaDonChiTiet;
import com.assignment.entity.HoaDonChiTietId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(HoaDonChiTietRepository.NAME)
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, HoaDonChiTietId> {
    public static final String NAME = "BaseHoaDonChiTietRepository";
}
