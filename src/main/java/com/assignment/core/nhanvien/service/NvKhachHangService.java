package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvCreateKhachHangRequest;
import com.assignment.core.nhanvien.model.request.NvKhachHangRequest;
import com.assignment.core.nhanvien.model.response.NvKhachHangResponse;
import com.assignment.entity.KhachHang;

public interface NvKhachHangService {
    PageableObject<NvKhachHangResponse> getAll(final NvKhachHangRequest request);

    KhachHang add(NvCreateKhachHangRequest request);

    KhachHang update(NvCreateKhachHangRequest request, String id);

    void delete(String id);

    KhachHang getOne(String id);
}
