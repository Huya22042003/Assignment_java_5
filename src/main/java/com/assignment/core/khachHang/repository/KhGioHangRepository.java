package com.assignment.core.khachHang.repository;

import com.assignment.core.khachHang.model.response.KhGioHangResponse;
import com.assignment.repository.GioHangRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KhGioHangRepository extends GioHangRepository {
//    WHERE gh.idkh = :idKh
    @Query(value = """
        SELECT 
            gh.id,
            gh.ma_gio_hang,
            gh.ngay_tao,
            gh.ngay_thanh_toan,
            gh.ten_nguoi_nhan,
            gh.dia_chi,
            gh.sdt,
            gh.tinh_trang
        FROM  gio_hang gh 
    """, countQuery = """
    SELECT COUNT(gh.id) FROM gio_hang gh 
    """, nativeQuery = true)
    Page<KhGioHangResponse> getListById(@Param("idKh") Long idKh, Pageable pageable);

}
