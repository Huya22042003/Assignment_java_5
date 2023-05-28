package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvMauSacRequest;
import com.assignment.core.nhanvien.model.request.NvCreateMauSacRequest;
import com.assignment.core.nhanvien.model.response.NvMauSacResponse;
import com.assignment.entity.MauSac;

public interface NvMauSacService {
    PageableObject<NvMauSacResponse> getAll(final NvMauSacRequest request);

    MauSac add(NvCreateMauSacRequest request);

    MauSac update(NvCreateMauSacRequest request, String id);

    void delete(String id);

    MauSac getOne(String id);
}
