package com.assignment.core.khachHang.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhAddHoaDonRequest {

    private String tenNguoiNhan;

    private String diaChi;

    private String sdt;

}
