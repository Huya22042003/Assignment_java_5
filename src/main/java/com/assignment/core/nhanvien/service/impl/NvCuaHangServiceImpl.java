package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvCreateCuaHangRequest;
import com.assignment.core.nhanvien.model.request.NvCuaHangRequest;
import com.assignment.core.nhanvien.model.response.NvCuaHangResponse;
import com.assignment.core.nhanvien.repository.NvCuaHangRepository;
import com.assignment.core.nhanvien.service.NvCuaHangService;
import com.assignment.entity.CuaHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvCuaHangServiceImpl implements NvCuaHangService {

    @Autowired
    private NvCuaHangRepository nvCuaHangRepository;

    @Override
    public PageableObject<NvCuaHangResponse> getAll(NvCuaHangRequest request) {
        Pageable pageable =  PageRequest.of(request.getPage(), request.getSize());
        Page<NvCuaHangResponse> res = nvCuaHangRepository.getAllCuaHang(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public CuaHang add(NvCreateCuaHangRequest request) {
        CuaHang ca = new CuaHang().builder().ma(request.getMa()).ten(request.getTen()).diaChi(request.getDiaChi()).build();
        nvCuaHangRepository.save(ca);
        return ca;
    }

    @Override
    public CuaHang update(NvCreateCuaHangRequest request, String id) {
        Optional<CuaHang> cuaHangOptional = nvCuaHangRepository.findById(Long.parseLong(id));
        cuaHangOptional.get().setMa(request.getMa());
        cuaHangOptional.get().setTen(request.getTen());
        cuaHangOptional.get().setDiaChi(request.getDiaChi());
        nvCuaHangRepository.save(cuaHangOptional.get());
        return cuaHangOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<CuaHang> cuaHangOptional = nvCuaHangRepository.findById(Long.parseLong(id));
        nvCuaHangRepository.delete(cuaHangOptional.get());
    }

    @Override
    public CuaHang getOne(String id) {
        Optional<CuaHang> cuaHangOptional = nvCuaHangRepository.findById(Long.parseLong(id));
        return cuaHangOptional.get();
    }
}
