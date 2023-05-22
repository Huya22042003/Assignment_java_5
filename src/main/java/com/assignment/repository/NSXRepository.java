package com.assignment.repository;

import com.assignment.entity.NSX;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository(NSXRepository.NAME)
public interface NSXRepository extends JpaRepository<NSX, Long> {
    public static final String NAME = "BaseNSXRepository";

}
