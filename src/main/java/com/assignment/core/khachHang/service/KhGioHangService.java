package com.assignment.core.khachHang.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.khachHang.model.request.KhAddSanPhamGioHangRequest;
import com.assignment.core.khachHang.model.request.KhCreateGioHangRequest;
import com.assignment.core.khachHang.model.request.KhUpdateGioHangRequest;
import com.assignment.core.khachHang.model.response.KhGioHangChiTietResponse;
import com.assignment.core.khachHang.model.response.KhGioHangResponse;

public interface KhGioHangService {
    PageableObject<KhGioHangResponse> getAllById(int page);
    PageableObject<KhGioHangChiTietResponse> getAllSanPhamGioHang(int page, Long idGh);
    boolean themGioHang(KhCreateGioHangRequest createGioHangRequest);
    boolean suaGioHang(KhUpdateGioHangRequest updateGioHangRequest, Long id);
    boolean xoaGioHang(Long id);
    boolean thanhToanGioHang(Long id);
    boolean themSanPhamVaoGioHang(KhAddSanPhamGioHangRequest addSanPhamGioHang, Long idSanPham, Long idGioHang);
    boolean updateGioHang(KhAddSanPhamGioHangRequest addSanPhamGioHang, Long idSanPham, Long idGioHang);
    boolean xoaSanPham(Long idSanPham, Long idGioHang);
}
