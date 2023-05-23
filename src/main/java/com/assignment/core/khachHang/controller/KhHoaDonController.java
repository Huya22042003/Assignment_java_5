package com.assignment.core.khachHang.controller;

import com.assignment.core.common.base.ResponseObject;
import com.assignment.core.khachHang.model.request.KhAddHoaDonRequest;
import com.assignment.core.khachHang.service.KhHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/khach-hang/hoa-don")
public class KhHoaDonController {

    @Autowired
    private KhHoaDonService hoaDonService;

    @GetMapping
    public ResponseObject getList(@RequestParam(name = "page", defaultValue = "0") int page) {
        return new ResponseObject(hoaDonService.pageHoaDon(page));
    }

    @PostMapping
    public ResponseObject newHoaDon(@RequestBody KhAddHoaDonRequest addHoaDonRequest) {
        return new ResponseObject(hoaDonService.newHoaDon(addHoaDonRequest));
    }

}
