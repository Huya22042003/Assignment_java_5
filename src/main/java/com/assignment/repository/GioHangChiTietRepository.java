package com.assignment.repository;

import com.assignment.entity.GioHangChiTiet;
import com.assignment.entity.GioHangChiTietId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(GioHangChiTietRepository.NAME)
public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet, GioHangChiTietId> {
    public static final String NAME = "BaseGioHangChiTietRepository";
}
