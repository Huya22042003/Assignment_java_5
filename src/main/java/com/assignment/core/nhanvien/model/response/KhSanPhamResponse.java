package com.assignment.core.nhanvien.service.khachHang.model.response;

import com.assignment.entity.SanPham;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {SanPham.class})
public interface KhSanPhamResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_sp}")
    String getMa();

    @Value("#{target.ten_sp}")
    String getTen();

}
