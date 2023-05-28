package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvNSXResponse;
import com.assignment.repository.NSXRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvNSXRepository extends NSXRepository {


    @Query(value = """
            SELECT ca.id, ca.ma_nsx, ca.ten_nsx
            FROM nsx ca
            """, countQuery = """
            SELECT COUNT(ca.id)
            FROM nsx ca
            """, nativeQuery = true)
    Page<NvNSXResponse> getAllNSX(Pageable pageable);
}
