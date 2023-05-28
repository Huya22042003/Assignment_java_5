package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvCreateKhachHangRequest;
import com.assignment.core.nhanvien.model.request.NvKhachHangRequest;
import com.assignment.core.nhanvien.service.NvKhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nhan-vien/khach-hang")
public class NvKhachHangController {

    @Autowired
    private NvKhachHangService nvKhachHangService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvKhachHangRequest request) {
        return new ResponseObject(nvKhachHangService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateKhachHangRequest request) {
        return new ResponseObject(nvKhachHangService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateKhachHangRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvKhachHangService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvKhachHangService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvKhachHangService.delete(id);
    }
}
