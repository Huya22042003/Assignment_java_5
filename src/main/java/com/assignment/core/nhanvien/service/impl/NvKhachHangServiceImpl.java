package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvCreateKhachHangRequest;
import com.assignment.core.nhanvien.model.request.NvKhachHangRequest;
import com.assignment.core.nhanvien.model.response.NvKhachHangResponse;
import com.assignment.core.nhanvien.repository.NvKhachHangRepository;
import com.assignment.core.nhanvien.service.NvKhachHangService;
import com.assignment.entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvKhachHangServiceImpl implements NvKhachHangService {

    @Autowired
    private NvKhachHangRepository nvKhachHangRepository;

    @Override
    public PageableObject<NvKhachHangResponse> getAll(NvKhachHangRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<NvKhachHangResponse> res = nvKhachHangRepository.getAllKhachHang(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public KhachHang add(NvCreateKhachHangRequest request) {
        KhachHang ca = new KhachHang()
                .builder()
                .ma(request.getMa())
                .ten(request.getTen())
                .ngaySinh(request.getNgaySinh())
                .diaChi(request.getDiaChi())
                .sdt(request.getSdt())
                .matKhau(request.getMatKhau())
                .build();
        nvKhachHangRepository.save(ca);
        return ca;
    }

    @Override
    public KhachHang update(NvCreateKhachHangRequest request, String id) {
        Optional<KhachHang> khachHangOptional = nvKhachHangRepository.findById(Long.parseLong(id));
        khachHangOptional.get().setMa(request.getMa());
        khachHangOptional.get().setTen(request.getTen());
        khachHangOptional.get().setNgaySinh(request.getNgaySinh());
        khachHangOptional.get().setDiaChi(request.getDiaChi());
        khachHangOptional.get().setSdt(request.getSdt());
        khachHangOptional.get().setMatKhau(request.getMatKhau());
        nvKhachHangRepository.save(khachHangOptional.get());
        return khachHangOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<KhachHang> khachHangOptional = nvKhachHangRepository.findById(Long.parseLong(id));
        nvKhachHangRepository.delete(khachHangOptional.get());
    }

    @Override
    public KhachHang getOne(String id) {
        Optional<KhachHang> khachHangOptional = nvKhachHangRepository.findById(Long.parseLong(id));
        return khachHangOptional.get();
    }
}
