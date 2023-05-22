package com.assignment.repository;

import com.assignment.entity.DongSp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(DongSpRepository.NAME)
public interface DongSpRepository extends JpaRepository<DongSp, Long> {
    public static final String NAME = "BaseDongSpRepository";
}
