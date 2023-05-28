package com.assignment.core.nhanvien.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvNSXRequest;
import com.assignment.core.nhanvien.model.request.NvCreateNSXRequest;
import com.assignment.core.nhanvien.model.response.NvNSXResponse;
import com.assignment.entity.NSX;

public interface NvNSXService {
    PageableObject<NvNSXResponse> getAll(final NvNSXRequest request);

    NSX add(NvCreateNSXRequest request);

    NSX update(NvCreateNSXRequest request, String id);

    void delete(String id);

    NSX getOne(String id);
}
