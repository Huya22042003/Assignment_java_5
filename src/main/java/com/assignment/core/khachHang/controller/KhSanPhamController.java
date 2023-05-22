package com.assignment.core.khachHang.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.khachHang.service.KhSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/khach-hang")
public class KhSanPhamController {

    @Autowired
    private KhSanPhamService khSanPhamService;

    @GetMapping("/san-pham")
    private ResponseObject getList(@RequestParam(value = "ten", defaultValue = "") String ten,
                                   @RequestParam(value = "ma", defaultValue = "") String ma,
                                   @RequestParam(value = "page", defaultValue = "0") int page
                                   ) {
        return new ResponseObject(khSanPhamService.getListSanPham(ten, ma, page));
    }

    @GetMapping("/san-pham/{id}")
    private ResponseObject getChiTietSanPham(@RequestParam(value = "page", defaultValue = "0") int page,
                                             @PathVariable(name = "id") Long id) {
        return new ResponseObject(khSanPhamService.getListChiTietSanPham(id, page));
    }
}
