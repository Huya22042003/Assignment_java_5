package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvSanPhamResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_sp}")
    String getMa();

    @Value("#{target.ten_sp}")
    String getTen();
}
