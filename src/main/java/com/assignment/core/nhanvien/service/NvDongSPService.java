package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvDongSPRequest;
import com.assignment.core.nhanvien.model.request.NvCreateDongSPRequest;
import com.assignment.core.nhanvien.model.response.NvDongSPResponse;
import com.assignment.entity.DongSP;

public interface NvDongSPService {
    PageableObject<NvDongSPResponse> getAll(final NvDongSPRequest request);

    DongSP add(NvCreateDongSPRequest request);

    DongSP update(NvCreateDongSPRequest request, String id);

    void delete(String id);

    DongSP getOne(String id);
}
