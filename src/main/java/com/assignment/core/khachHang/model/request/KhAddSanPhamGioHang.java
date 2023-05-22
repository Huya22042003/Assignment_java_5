package com.assignment.core.khachHang.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhAddSanPhamGioHang {

    private int soLuongMua;

    private BigDecimal donGia;

    private BigDecimal donGiaKhiGiam;

}
