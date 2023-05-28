package com.assignment.repository;

import com.assignment.entity.DongSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(DongSpRepository.NAME)
public interface DongSpRepository extends JpaRepository<DongSP, Long> {
    public static final String NAME = "BaseDongSpRepository";
}
