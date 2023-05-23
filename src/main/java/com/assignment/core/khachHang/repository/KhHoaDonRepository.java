package com.assignment.core.khachHang.repository;

import com.assignment.core.khachHang.model.response.KhHoaDonResponse;
import com.assignment.repository.HoaDonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KhHoaDonRepository extends HoaDonRepository {
    @Query(value = """
        SELECT 
            ROW_NUMBER() OVER(ORDER BY gv.last_modified_date DESC) AS stt,
            hd.id,
            kh.ten,
            hd.ma,
            hd.ngay_tao,
            hd.ngay_thanh_toan,
            hd.ngay_ship,
            hd.ngay_nhan,
            hd.tinh_trang,
            hd.ten_nguoi_nhan,
            hd.dia_chi,
            hd.sdt
        FROM hoa_don hd JOIN khach_hang kh ON hd.idkh = kh.id
    """, nativeQuery = true)
    Page<KhHoaDonResponse> getList(@Param("idKh") Long idKh, Pageable pageable);
}
