package com.assignment.core.khachHang.model.response;

import com.assignment.entity.ChiTietSanPham;
import com.assignment.entity.DongSp;
import com.assignment.entity.MauSac;
import com.assignment.entity.NSX;
import com.assignment.entity.SanPham;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.util.UUID;

@Projection(types = {ChiTietSanPham.class, SanPham.class, NSX.class, MauSac.class, DongSp.class})
public interface KhChiTietSanPhamResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_sp}")
    String getMaSp();

    @Value("#{target.ten_sp}")
    String getTenSp();

    @Value("#{target.ten_nsx}")
    String getTenNsx();

    @Value("#{target.ten_mau_sac}")
    String getTenMauSac();

    @Value("#{target.ten_dong_sp}")
    String getTenDongSp();

    @Value("#{target.nam_bh}")
    int getNamBh();

    @Value("#{target.mo_ta}")
    String getMoTa();

    @Value("#{target.so_luong}")
    String getSoLuong();

    @Value("#{target.gia_nhap}")
    BigDecimal getGiaNhap();

    @Value("#{target.gia_ban}")
    BigDecimal getGiaBan();

    @Value("#{target.ngay_nhap}")
    Long getNgayNhap();

}
