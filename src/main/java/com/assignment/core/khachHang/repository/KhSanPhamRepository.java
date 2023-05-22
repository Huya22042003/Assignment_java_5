package com.assignment.core.khachHang.repository;

import com.assignment.core.khachHang.model.response.KhSanPhamResponse;
import com.assignment.repository.SanPhamRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KhSanPhamRepository extends SanPhamRepository {

    @Query(value = """
        SELECT s.id, s.ma_sp, s.ten_sp FROM san_pham s WHERE s.ten_sp LIKE CONCAT('%',:ten,'%') AND s.ma_sp LIKE CONCAT('%',:ma,'%')
    """, countQuery = """
        SELECT COUNT(s.id)  FROM san_pham s WHERE s.ten_sp LIKE CONCAT('%',:ten,'%') AND s.ma_sp LIKE CONCAT('%',:ma,'%')
    """ , nativeQuery = true)
    Page<KhSanPhamResponse> getListSanPham(@Param("ten") String ten, @Param("ma") String ma, Pageable page);
}
