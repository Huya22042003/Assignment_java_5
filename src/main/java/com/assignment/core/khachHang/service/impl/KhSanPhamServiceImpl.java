package com.assignment.core.khachHang.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.khachHang.model.response.KhChiTietSanPhamResponse;
import com.assignment.core.khachHang.model.response.KhSanPhamResponse;
import com.assignment.core.khachHang.repository.KhChiTietSanPhamRepository;
import com.assignment.core.khachHang.repository.KhSanPhamRepository;
import com.assignment.core.khachHang.service.KhSanPhamService;
import com.assignment.infrastructure.constant.PaginationConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhSanPhamServiceImpl implements KhSanPhamService {

    @Autowired
    private KhSanPhamRepository khSanPhamRepository;

    @Autowired
    private KhChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public PageableObject<KhSanPhamResponse> getListSanPham(String ten, String ma, int page) {
        Pageable pageable = PageRequest.of(page, PaginationConstant.DEFAULT_SIZE);
        Page pages = khSanPhamRepository.getListSanPham(ten, ma, pageable);
        return new PageableObject<>(pages);
    }

    @Override
    public PageableObject<KhChiTietSanPhamResponse> getListChiTietSanPham(Long id, int page) {
        Pageable pageable = PageRequest.of(page, PaginationConstant.DEFAULT_SIZE);
        Page pages = chiTietSanPhamRepository.getList(id, pageable);
        return new PageableObject<>(pages);
    }
}
