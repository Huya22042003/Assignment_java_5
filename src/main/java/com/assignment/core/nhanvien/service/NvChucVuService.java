package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvChucVuRequest;
import com.assignment.core.nhanvien.model.response.NvChucVuResponse;

public interface NvChucVuService {
    PageableObject<NvChucVuResponse> getAllChucVu(final NvChucVuRequest request);
}
