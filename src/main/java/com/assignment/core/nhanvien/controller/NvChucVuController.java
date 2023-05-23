package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.khachHang.model.request.KhAddSanPhamGioHang;
import com.assignment.core.khachHang.model.request.KhCreateGioHangRequest;
import com.assignment.core.khachHang.model.request.KhUpdateGioHangRequest;
import com.assignment.core.khachHang.service.KhGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nhan-vien")
public class NvChucVuController {

    @Autowired
    private KhGioHangService gioHangService;



}
