package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvSanPhamResponse;
import com.assignment.repository.SanPhamRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvSanPhamRepository extends SanPhamRepository {


    @Query(value = """
            SELECT ca.id, ca.ma_sp, ca.ten_sp
            FROM san_pham ca
            """, countQuery = """
            SELECT COUNT(ca.id)
            FROM san_pham ca
            """, nativeQuery = true)
    Page<NvSanPhamResponse> getAllSanPham(Pageable pageable);
}
