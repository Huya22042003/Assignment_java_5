package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvNhanVienRequest;
import com.assignment.core.nhanvien.model.request.NvCreateNhanVienRequest;
import com.assignment.core.nhanvien.model.response.NvNhanVienResponse;
import com.assignment.entity.NhanVien;

public interface NvNhanVienService {
    PageableObject<NvNhanVienResponse> getAll(final NvNhanVienRequest request);

    NhanVien add(NvCreateNhanVienRequest request);

    NhanVien update(NvCreateNhanVienRequest request, String id);

    void delete(String id);

    NhanVien getOne(String id);
}
