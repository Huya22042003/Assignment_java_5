package com.assignment.repository;

import com.assignment.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(MauSacRepository.NAME)
public interface MauSacRepository extends JpaRepository<MauSac, Long> {
    public static final String NAME = "BaseMauSacRepository";

}
