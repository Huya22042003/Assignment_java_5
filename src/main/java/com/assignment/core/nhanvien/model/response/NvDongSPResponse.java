package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvDongSPResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_dong_sp}")
    String getMa();

    @Value("#{target.ten_dong_sp}")
    String getTen();
}
