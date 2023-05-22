package com.assignment.core.khachHang.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhCreateGioHangRequest {

    private String tenNguoiNhan;

    private String diaChi;

    private String sdt;

}
