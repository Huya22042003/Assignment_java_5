package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvNhanVienRequest;
import com.assignment.core.nhanvien.model.request.NvCreateNhanVienRequest;
import com.assignment.core.nhanvien.model.response.NvNhanVienResponse;
import com.assignment.core.nhanvien.repository.NvNhanVienRepository;
import com.assignment.core.nhanvien.service.NvNhanVienService;
import com.assignment.entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvNhanVienServiceImpl implements NvNhanVienService {

    @Autowired
    private NvNhanVienRepository nvNhanVienRepository;

    @Override
    public PageableObject<NvNhanVienResponse> getAll(NvNhanVienRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<NvNhanVienResponse> res = nvNhanVienRepository.getAllNhanVien(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public NhanVien add(NvCreateNhanVienRequest request) {
        NhanVien ca = new NhanVien()
                .builder()
                .ma(request.getMa())
                .ten(request.getTen())
                .gioiTinh(request.getGioiTinh())
                .ngaySinh(request.getNgaySinh())
                .diaChi(request.getDiaChi())
                .sdt(request.getSdt())
                .matKhau(request.getMatKhau())
                .trangThai(request.getTrangThai())
                .idCh(request.getIdCh())
                .idCv(request.getIdCv())
                .idGuiBc(request.getIdGuiBc())
                .build();
        nvNhanVienRepository.save(ca);
        return ca;
    }

    @Override
    public NhanVien update(NvCreateNhanVienRequest request, String id) {
        Optional<NhanVien> nhanVienOptional = nvNhanVienRepository.findById(Long.parseLong(id));
        nhanVienOptional.get().setMa(request.getMa());
        nhanVienOptional.get().setTen(request.getTen());
        nhanVienOptional.get().setGioiTinh(request.getGioiTinh());
        nhanVienOptional.get().setNgaySinh(request.getNgaySinh());
        nhanVienOptional.get().setDiaChi(request.getDiaChi());
        nhanVienOptional.get().setSdt(request.getSdt());
        nhanVienOptional.get().setMatKhau(request.getMatKhau());
        nhanVienOptional.get().setTrangThai(request.getTrangThai());
        nhanVienOptional.get().setIdCh(request.getIdCh());
        nhanVienOptional.get().setIdCv(request.getIdCv());
        nhanVienOptional.get().setIdGuiBc(request.getIdGuiBc());
        nvNhanVienRepository.save(nhanVienOptional.get());
        return nhanVienOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<NhanVien> nhanVienOptional = nvNhanVienRepository.findById(Long.parseLong(id));
        nvNhanVienRepository.delete(nhanVienOptional.get());
    }

    @Override
    public NhanVien getOne(String id) {
        Optional<NhanVien> nhanVienOptional = nvNhanVienRepository.findById(Long.parseLong(id));
        return nhanVienOptional.get();
    }
}
