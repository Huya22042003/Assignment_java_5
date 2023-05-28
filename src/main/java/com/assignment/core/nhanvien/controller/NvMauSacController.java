package com.assignment.core.nhanvien.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.nhanvien.model.request.NvMauSacRequest;
import com.assignment.core.nhanvien.model.request.NvCreateMauSacRequest;
import com.assignment.core.nhanvien.service.NvMauSacService;
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
@RequestMapping("/api/nhan-vien/mau-sac")
public class NvMauSacController {

    @Autowired
    private NvMauSacService nvMauSacService;

    @GetMapping("/get-all")
    public ResponseObject getAll(final NvMauSacRequest request) {
        return new ResponseObject(nvMauSacService.getAll(request));
    }

    @PostMapping("/add")
    public ResponseObject add(@Valid @RequestBody NvCreateMauSacRequest request) {
        return new ResponseObject(nvMauSacService.add(request));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@Valid @RequestBody NvCreateMauSacRequest request, @PathVariable("id") String id) {
        return new ResponseObject(nvMauSacService.update(request, id));
    }

    @GetMapping("/get-one/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(nvMauSacService.getOne(id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        nvMauSacService.delete(id);
    }
}
