package com.assignment.core.nhanvien.model.response;

import org.springframework.beans.factory.annotation.Value;

public interface NvCuaHangResponse {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma}")
    String getMa();

    @Value("#{target.ten}")
    String getTen();

    @Value("#{target.dia_chi}")
    String getDiaChi();
}
