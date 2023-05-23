package com.assignment.core.nhanvien.model.response;

import com.assignment.entity.ChucVu;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {ChucVu.class})
public interface NvChucVuResponse {
    @Value("#{target.id}")
    Long getId();

    @Value("#{target.ma}")
    String getMa();

    @Value("#{target.ten}")
    String getTen();
}
