package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvKhachHangResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma}")
    String getMa();

    @Value("#{target.ten}")
    String getTen();

    @Value("#{target.ngay_sinh}")
    String getNgaySinh();

    @Value("#{target.dia_chi}")
    String getDiaChi();

    @Value("#{target.sdt}")
    String getSdt();

    @Value("#{target.mat_khau}")
    String getMatKhau();
}
