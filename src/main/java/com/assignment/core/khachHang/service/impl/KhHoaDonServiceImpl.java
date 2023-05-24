package com.assignment.core.khachHang.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.khachHang.model.request.KhAddHoaDonRequest;
import com.assignment.core.khachHang.model.response.KhHoaDonResponse;
import com.assignment.core.khachHang.repository.KhHoaDonRepository;
import com.assignment.core.khachHang.service.KhHoaDonService;
import com.assignment.entity.HoaDon;
import com.assignment.infrastructure.constant.KhachHangTestContants;
import com.assignment.infrastructure.constant.PaginationConstant;
import com.assignment.utils.DateTimeUtil;
import com.assignment.utils.GeneraterMa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhHoaDonServiceImpl implements KhHoaDonService {

    @Autowired
    private KhHoaDonRepository hoaDonRepository;

    @Override
    public PageableObject<KhHoaDonResponse> pageHoaDon(int page) {
        Pageable pageable = PageRequest.of(page, PaginationConstant.DEFAULT_SIZE);
        Page<KhHoaDonResponse> hoaDonResponses = hoaDonRepository.getList(KhachHangTestContants.ID_KHACH_HANG, pageable);
        return new PageableObject<>(hoaDonResponses);
    }

    @Override
    public boolean newHoaDon(KhAddHoaDonRequest hoaDonRequest) {
        try {
            HoaDon hoaDon = new HoaDon();

            hoaDon.setDiaChi(hoaDon.getDiaChi());
            hoaDon.setIdKh(KhachHangTestContants.ID_KHACH_HANG);
            hoaDon.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
            hoaDon.setMa(GeneraterMa.gen("HD"));
            hoaDon.setTenNguoiNhan(hoaDonRequest.getTenNguoiNhan());
            hoaDon.setSdt(hoaDonRequest.getSdt());
            hoaDon.setTinhTrang(0);
            hoaDonRepository.save(hoaDon);

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean daNhanDuocHang() {
        return false;
    }


}
