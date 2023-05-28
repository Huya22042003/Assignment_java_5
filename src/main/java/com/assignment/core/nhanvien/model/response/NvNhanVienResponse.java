package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvNhanVienResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma}")
    String getMa();

    @Value("#{target.ten}")
    String getTen();

    @Value("#{target.gioi_tinh}")
    String getGioiTinh();

    @Value("#{target.ngay_sinh}")
    String getNgaySinh();

    @Value("#{target.dia_chi}")
    String getDiaChi();

    @Value("#{target.sdt}")
    String getSdt();

    @Value("#{target.mat_khau}")
    String getMatKhau();

    @Value("#{target.trang_thai}")
    Integer getTrangThai();

    @Value("#{target.idch}")
    Long getIdCh();

    @Value("#{target.idcv}")
    Long getIdCv();

    @Value("#{target.id_gui_bc}")
    Long getIdGuiBc();
}
