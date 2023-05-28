package com.assignment.core.khachHang.model.response;

import com.assignment.entity.ChiTietSanPham;
import com.assignment.entity.DongSP;
import com.assignment.entity.GioHang;
import com.assignment.entity.GioHangChiTiet;
import com.assignment.entity.MauSac;
import com.assignment.entity.NSX;
import com.assignment.entity.SanPham;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(types = {GioHangChiTiet.class, GioHang.class, ChiTietSanPham.class, SanPham.class, DongSP.class, MauSac.class, NSX.class})
public interface KhGioHangChiTietResponse {

    @Value("#{target.id_chi_tiet_sp}")
    Long getIdSanPham();

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
    String getSoLuongTon();

    @Value("#{target.gia_ban}")
    BigDecimal getGiaBan();

    @Value("#{target.so_luong}")
    int getSoLuongMua();

    @Value("#{target.don_gia_khi_giam}")
    BigDecimal getDonGiaKhiGiam();
}
