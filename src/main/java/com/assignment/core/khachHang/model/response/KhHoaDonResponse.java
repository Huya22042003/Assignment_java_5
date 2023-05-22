package com.assignment.core.khachHang.model.response;

import com.assignment.entity.HoaDon;
import com.assignment.entity.KhachHang;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {HoaDon.class, KhachHang.class})
public interface KhHoaDonResponse {

    Integer getStt();

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ten}")
    String getTenKhachHang();

    @Value("#{target.ma}")
    String getMaHoaDon();

    @Value("#{target.ngay_tao}")
    Long getNgayTao();

    @Value("#{target.ngay_thanh_toan}")
    Long getNgayThanhToan();

    @Value("#{target.ngay_ship}")
    Long getNgayShip();

    @Value("#{target.ngay_nhan}")
    Long getNgayNhan();

    @Value("#{target.tinh_trang}")
    int getTinhTrang();

    @Value("#{target.ten_nguoi_nhan}")
    String getTenNguoiNhan();

    @Value("#{target.dia_chi}")
    String getDiaChi();

    @Value("#{target.sdt}")
    String getSdt();

}
