package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvSanPhamRequest;
import com.assignment.core.nhanvien.model.request.NvCreateSanPhamRequest;
import com.assignment.core.nhanvien.model.response.NvSanPhamResponse;
import com.assignment.entity.SanPham;

public interface NvSanPhamService {
    PageableObject<NvSanPhamResponse> getAll(final NvSanPhamRequest request);

    SanPham add(NvCreateSanPhamRequest request);

    SanPham update(NvCreateSanPhamRequest request, String id);

    void delete(String id);

    SanPham getOne(String id);
}
