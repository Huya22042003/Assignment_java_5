//package com.assignment.core.nhanvien.controller;
//
//import com.assignment.core.common.base.ResponseObject;
//import com.assignment.core.nhanvien.model.request.NvChucVuRequest;
//import com.assignment.core.nhanvien.model.request.NvCreateChucVuRequest;
//import com.assignment.core.nhanvien.service.NvChucVuService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/nhan-vien/chuc-vu")
//public class NvChucVuController {
//
//    @Autowired
//    private NvChucVuService nvChucVuService;
//
//    @GetMapping("/get-all")
//    public ResponseObject getAll(final NvChucVuRequest request) {
//        return new ResponseObject(nvChucVuService.getAll(request));
//    }
//
//    @PostMapping("/add")
//    public ResponseObject add(@Valid @RequestBody NvCreateChucVuRequest request) {
//        return new ResponseObject(nvChucVuService.add(request));
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseObject update(@Valid @RequestBody NvCreateChucVuRequest request, @PathVariable("id") String id) {
//        return new ResponseObject(nvChucVuService.update(request, id));
//    }
//
//    @GetMapping("/get-one/{id}")
//    public ResponseObject getOne(@PathVariable("id") String id) {
//        return new ResponseObject(nvChucVuService.getOne(id));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable("id") String id) {
//        nvChucVuService.delete(id);
//    }
//}
