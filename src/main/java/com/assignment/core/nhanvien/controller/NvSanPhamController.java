package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvSanPhamRequest;
import com.assignment.core.nhanvien.model.request.NvCreateSanPhamRequest;
import com.assignment.core.nhanvien.service.NvSanPhamService;
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
@RequestMapping("/api/nhan-vien/san-pham")
public class NvSanPhamController {

    @Autowired
    private NvSanPhamService nvSanPhamService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvSanPhamRequest request) {
        return new ResponseObject(nvSanPhamService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateSanPhamRequest request) {
        return new ResponseObject(nvSanPhamService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateSanPhamRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvSanPhamService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvSanPhamService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvSanPhamService.delete(id);
    }
}
