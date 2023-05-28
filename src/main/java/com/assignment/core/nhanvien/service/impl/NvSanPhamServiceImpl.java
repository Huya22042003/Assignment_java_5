package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvSanPhamRequest;
import com.assignment.core.nhanvien.model.request.NvCreateSanPhamRequest;
import com.assignment.core.nhanvien.model.response.NvSanPhamResponse;
import com.assignment.core.nhanvien.repository.NvSanPhamRepository;
import com.assignment.core.nhanvien.service.NvSanPhamService;
import com.assignment.entity.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvSanPhamServiceImpl implements NvSanPhamService {

    @Autowired
    private NvSanPhamRepository nvSanPhamRepository;

    @Override
    public PageableObject<NvSanPhamResponse> getAll(NvSanPhamRequest request) {
        Pageable pageable =  PageRequest.of(request.getPage(), request.getSize());
        Page<NvSanPhamResponse> res = nvSanPhamRepository.getAllSanPham(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public SanPham add(NvCreateSanPhamRequest request) {
        SanPham ca = new SanPham().builder().ma(request.getMa()).ten(request.getTen()).build();
        nvSanPhamRepository.save(ca);
        return ca;
    }

    @Override
    public SanPham update(NvCreateSanPhamRequest request, String id) {
        Optional<SanPham> sanPhamOptional = nvSanPhamRepository.findById(Long.parseLong(id));
        sanPhamOptional.get().setMa(request.getMa());
        sanPhamOptional.get().setTen(request.getTen());
        nvSanPhamRepository.save(sanPhamOptional.get());
        return sanPhamOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<SanPham> sanPhamOptional = nvSanPhamRepository.findById(Long.parseLong(id));
        nvSanPhamRepository.delete(sanPhamOptional.get());
    }

    @Override
    public SanPham getOne(String id) {
        Optional<SanPham> sanPhamOptional = nvSanPhamRepository.findById(Long.parseLong(id));
        return sanPhamOptional.get();
    }
}
