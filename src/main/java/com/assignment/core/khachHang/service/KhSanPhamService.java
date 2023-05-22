package com.assignment.core.khachHang.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.khachHang.model.response.KhChiTietSanPhamResponse;
import com.assignment.core.khachHang.model.response.KhSanPhamResponse;

import java.util.UUID;

public interface KhSanPhamService {
    PageableObject<KhSanPhamResponse> getListSanPham(String ten, String ma, int page);
    PageableObject<KhChiTietSanPhamResponse> getListChiTietSanPham(Long id, int page);
}
