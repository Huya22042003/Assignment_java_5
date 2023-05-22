package com.assignment.core.khachHang.model.response;

import com.assignment.entity.GioHang;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {GioHang.class})
public interface KhGioHangResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_gio_hang}")
    String getMa();

    @Value("#{target.ngay_tao}")
    Long getNgayTao();

    @Value("#{target.ngay_thanh_toan}")
    Long getNgayThanhToan();

    @Value("#{target.ten_nguoi_nhan}")
    String getTenNguoiNhan();

    @Value("#{target.dia_chi}")
    String getDiaChi();

    @Value("#{target.sdt}")
    String getSdt();

    @Value("#{target.tinh_trang}")
    int getTinhTrang();

}
