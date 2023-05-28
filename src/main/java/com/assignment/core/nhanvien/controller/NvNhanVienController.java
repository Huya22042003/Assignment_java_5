package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvNhanVienRequest;
import com.assignment.core.nhanvien.model.request.NvCreateNhanVienRequest;
import com.assignment.core.nhanvien.service.NvNhanVienService;
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
@RequestMapping("/api/nhan-vien/nhan-vien")
public class NvNhanVienController {

    @Autowired
    private NvNhanVienService nvNhanVienService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvNhanVienRequest request) {
        return new ResponseObject(nvNhanVienService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateNhanVienRequest request) {
        return new ResponseObject(nvNhanVienService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateNhanVienRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvNhanVienService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvNhanVienService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvNhanVienService.delete(id);
    }
}
