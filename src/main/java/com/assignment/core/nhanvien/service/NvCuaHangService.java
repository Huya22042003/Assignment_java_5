package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvCreateCuaHangRequest;
import com.assignment.core.nhanvien.model.request.NvCuaHangRequest;
import com.assignment.core.nhanvien.model.response.NvCuaHangResponse;
import com.assignment.entity.CuaHang;

public interface NvCuaHangService {
    PageableObject<NvCuaHangResponse> getAll(final NvCuaHangRequest request);

    CuaHang add(NvCreateCuaHangRequest request);

    CuaHang update(NvCreateCuaHangRequest request, String id);

    void delete(String id);

    CuaHang getOne(String id);
}
