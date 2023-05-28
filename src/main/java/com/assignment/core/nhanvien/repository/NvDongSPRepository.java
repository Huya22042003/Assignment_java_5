package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvDongSPResponse;
import com.assignment.repository.DongSpRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvDongSPRepository extends DongSpRepository {


    @Query(value = """
            SELECT ca.id, ca.ma_dong_sp, ca.ten_dong_sp
            FROM dong_sp ca
            """, countQuery = """
            SELECT COUNT(ca.id)
            FROM dong_sp ca
            """, nativeQuery = true)
    Page<NvDongSPResponse> getAllDongSP(Pageable pageable);
}
