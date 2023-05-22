package com.assignment.core.khachHang.repository;

import com.assignment.core.khachHang.model.response.KhGioHangChiTietResponse;
import com.assignment.repository.GioHangChiTietRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KhGioHangChiTietRepository extends GioHangChiTietRepository {

    @Query(value = """
        SELECT 
            ghct.id_chi_tiet_sp,
            sp.ma_sp,
            sp.ten_sp,
            nsx.ten_nsx,
            ms.ten_mau_sac,
            dsp.ten_dong_sp,
            ctsp.nam_bh,
            ctsp.mo_ta,
            ctsp.so_luong,
            ctsp.gia_ban,
            ghct.so_luong,
            ghct.don_gia,
            ghct.don_gia_khi_giam
        FROM gio_hang_chi_tiet ghct JOIN gio_hang gh ON ghct.id_gio_hang = gh.id
        JOIN chi_tiet_san_pham ctsp ON ghct.id_chi_tiet_sp = ctsp.id
        JOIN san_pham sp ON sp.id = ctsp.id_sp
        JOIN nsx nsx ON nsx.id = ctsp.id_nsx
        JOIN mau_sac ms ON ms.id = ctsp.id_mau_sac
        JOIN dong_sp dsp ON dsp.id = ctsp.id_dong_sp
        WHERE ghct.id_gio_hang = :idGh
    """, nativeQuery = true)
    Page<KhGioHangChiTietResponse> getAllGioHangChiTiet(@Param("idGh") Long idGh, Pageable pageable);
}
