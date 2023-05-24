package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvChucVuRequest;
import com.assignment.core.nhanvien.model.request.NvCreateChucVuRequest;
import com.assignment.core.nhanvien.model.response.NvChucVuResponse;
import com.assignment.entity.ChucVu;

public interface NvChucVuService {
    PageableObject<NvChucVuResponse> getAll(final NvChucVuRequest request);

    ChucVu add(NvCreateChucVuRequest request);

    ChucVu update(NvCreateChucVuRequest request, String id);

    void delete(String id);

    ChucVu getOne(String id);
}
