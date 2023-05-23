package com.assignment.core.khachHang.service;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.khachHang.model.request.KhAddHoaDonRequest;
import com.assignment.core.khachHang.model.response.KhHoaDonResponse;

public interface KhHoaDonService {
    PageableObject<KhHoaDonResponse> pageHoaDon(int page);
    boolean newHoaDon(KhAddHoaDonRequest hoaDonRequest);
    boolean daNhanDuocHang();
}
