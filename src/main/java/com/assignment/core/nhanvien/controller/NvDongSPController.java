package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvDongSPRequest;
import com.assignment.core.nhanvien.model.request.NvCreateDongSPRequest;
import com.assignment.core.nhanvien.service.NvDongSPService;
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
@RequestMapping("/api/nhan-vien/dong-sp")
public class NvDongSPController {

    @Autowired
    private NvDongSPService nvDongSPService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvDongSPRequest request) {
        return new ResponseObject(nvDongSPService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateDongSPRequest request) {
        return new ResponseObject(nvDongSPService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateDongSPRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvDongSPService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvDongSPService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvDongSPService.delete(id);
    }
}
