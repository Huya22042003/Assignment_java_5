package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvCreateCuaHangRequest;
import com.assignment.core.nhanvien.model.request.NvCuaHangRequest;
import com.assignment.core.nhanvien.service.NvCuaHangService;
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
@RequestMapping("/api/nhan-vien/cua-hang")
public class NvCuaHangController {

    @Autowired
    private NvCuaHangService nvCuaHangService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvCuaHangRequest request) {
        return new ResponseObject(nvCuaHangService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateCuaHangRequest request) {
        return new ResponseObject(nvCuaHangService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateCuaHangRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvCuaHangService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvCuaHangService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvCuaHangService.delete(id);
    }
}
