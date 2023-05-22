package com.assignment.core.khachHang.repository;

import com.assignment.core.khachHang.model.response.KhChiTietSanPhamResponse;
import com.assignment.repository.ChiTietSanPhamRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface KhChiTietSanPhamRepository extends ChiTietSanPhamRepository {

    @Query(value = """
        SELECT 
            ctsp.id,
            sp.ma_sp,
            sp.ten_sp,
            nsx.ten_nsx,
            ms.ten_mau_sac,
            dsp.ten_dong_sp,
            ctsp.nam_bh,
            ctsp.mo_ta,
            ctsp.so_luong,
            ctsp.gia_nhap,
            ctsp.gia_ban,
            ctsp.ngay_nhap 
        FROM chi_tiet_san_pham ctsp 
        JOIN san_pham sp ON ctsp.id_sp = sp.id
        JOIN nsx nsx ON nsx.id = ctsp.id_nsx
        JOIN mau_sac ms ON ms.id = ctsp.id_mau_sac
        JOIN dong_sp dsp ON dsp.id = ctsp.id_dong_sp
        WHERE sp.id = :id
    """, countQuery = """
        SELECT COUNT(ctsp.id) 
        FROM chi_tiet_san_pham ctsp 
        JOIN san_pham sp ON ctsp.id_sp = sp.id
        JOIN nsx nsx ON nsx.id = ctsp.id_nsx
        JOIN mau_sac ms ON ms.id = ctsp.id_mau_sac
        JOIN dong_sp dsp ON dsp.id = ctsp.id_dong_sp
        WHERE sp.id = :id
    """, nativeQuery = true)
    Page<KhChiTietSanPhamResponse> getList(@Param("id") Long id, Pageable page);
}
