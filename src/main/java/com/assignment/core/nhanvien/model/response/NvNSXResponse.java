package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvNSXResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_nsx}")
    String getMa();

    @Value("#{target.ten_nsx}")
    String getTen();
}
