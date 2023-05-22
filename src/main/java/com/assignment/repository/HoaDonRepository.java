package com.assignment.repository;

import com.assignment.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(HoaDonRepository.NAME)
public interface HoaDonRepository extends JpaRepository<HoaDon, Long> {
    public static final String NAME = "BaseHoaDonRepository";

}
