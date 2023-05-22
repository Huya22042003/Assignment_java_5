package com.assignment.core.khachHang.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhUpdateGioHangRequest {

    private String tenNguoiNhan;

    private String diaChi;

    private String getSdt;

}
