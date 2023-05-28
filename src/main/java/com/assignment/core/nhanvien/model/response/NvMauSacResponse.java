package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvMauSacResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma_mau_sac}")
    String getMa();

    @Value("#{target.ten_mau_sac}")
    String getTen();
}
