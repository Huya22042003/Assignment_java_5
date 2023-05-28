package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvNSXRequest;
import com.assignment.core.nhanvien.model.request.NvCreateNSXRequest;
import com.assignment.core.nhanvien.service.NvNSXService;
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
@RequestMapping("/api/nhan-vien/nsx")
public class NvNSXController {

    @Autowired
    private NvNSXService nvNSXService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvNSXRequest request) {
        return new ResponseObject(nvNSXService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateNSXRequest request) {
        return new ResponseObject(nvNSXService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateNSXRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvNSXService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvNSXService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvNSXService.delete(id);
    }
}