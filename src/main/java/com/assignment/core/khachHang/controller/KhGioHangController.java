package com.assignment.core.khachHang.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.khachHang.model.request.KhAddSanPhamGioHang;
import com.assignment.core.khachHang.model.request.KhCreateGioHangRequest;
import com.assignment.core.khachHang.model.request.KhUpdateGioHangRequest;
import com.assignment.core.khachHang.service.KhGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/khach-hang/gio-hang")
public class KhGioHangController {

    @Autowired
    private KhGioHangService gioHangService;

    @GetMapping
    public ResponseObject listGioHang(@RequestParam(name = "page", defaultValue = "0") int page) {
        return new ResponseObject(gioHangService.getAllById(page));
    }

    @GetMapping("/{id}")
    public ResponseObject detailGioHang(@PathVariable(name = "id") Long id
            , @RequestParam(name = "page", defaultValue = "0") int page) {
        return new ResponseObject(gioHangService.getAllSanPhamGioHang(page, id));
    }

    @PostMapping("/new")
    public ResponseObject themMoiGioHang(@RequestBody KhCreateGioHangRequest createGioHangRequest) {
        return new ResponseObject(gioHangService.themGioHang(createGioHangRequest));
    }

    @PutMapping("/update/{id}")
    public ResponseObject suaGioHang(@RequestBody KhUpdateGioHangRequest updateGioHangRequest
            , @PathVariable(name = "id") Long id) {
        return new ResponseObject(gioHangService.suaGioHang(updateGioHangRequest, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseObject xoaGioHang(@PathVariable(name = "id") Long id) {
        return new ResponseObject(gioHangService.xoaGioHang(id));
    }

    @PostMapping("/add-gio-hang")
    public ResponseObject addGioHang(@RequestBody KhAddSanPhamGioHang addSanPhamGioHang,
                                     @RequestParam(name = "idSanPham", defaultValue = "0") Long idSp,
                                     @RequestParam(name = "idGioHang", defaultValue = "0") Long idGh) {
        return new ResponseObject(gioHangService.themSanPhamVaoGioHang(addSanPhamGioHang, idSp, idGh));
    }

    @PutMapping("/update-gio-hang")
    public ResponseObject updateGioHang(@RequestBody KhAddSanPhamGioHang addSanPhamGioHang,
                                     @RequestParam(name = "idSanPham", defaultValue = "0") Long idSp,
                                     @RequestParam(name = "idGioHang", defaultValue = "0") Long idGh) {
        return new ResponseObject(gioHangService.updateGioHang(addSanPhamGioHang, idSp, idGh));
    }

    @DeleteMapping("/delete-gio-hang")
    public ResponseObject deleteGioHang(
                                     @RequestParam(name = "idSanPham", defaultValue = "0") Long idSp,
                                     @RequestParam(name = "idGioHang", defaultValue = "0") Long idGh) {
        return new ResponseObject(gioHangService.xoaSanPham(idSp, idGh));
    }

}
