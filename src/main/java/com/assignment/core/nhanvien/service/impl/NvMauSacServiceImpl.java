package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvMauSacRequest;
import com.assignment.core.nhanvien.model.request.NvCreateMauSacRequest;
import com.assignment.core.nhanvien.model.response.NvMauSacResponse;
import com.assignment.core.nhanvien.repository.NvMauSacRepository;
import com.assignment.core.nhanvien.service.NvMauSacService;
import com.assignment.entity.MauSac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvMauSacServiceImpl implements NvMauSacService {

    @Autowired
    private NvMauSacRepository nvMauSacRepository;

    @Override
    public PageableObject<NvMauSacResponse> getAll(NvMauSacRequest request) {
        Pageable pageable =  PageRequest.of(request.getPage(), request.getSize());
        Page<NvMauSacResponse> res = nvMauSacRepository.getAllMauSac(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public MauSac add(NvCreateMauSacRequest request) {
        MauSac ca = new MauSac().builder().ma(request.getMa()).ten(request.getTen()).build();
        nvMauSacRepository.save(ca);
        return ca;
    }

    @Override
    public MauSac update(NvCreateMauSacRequest request, String id) {
        Optional<MauSac> MauSacOptional = nvMauSacRepository.findById(Long.parseLong(id));
        MauSacOptional.get().setMa(request.getMa());
        MauSacOptional.get().setTen(request.getTen());
        nvMauSacRepository.save(MauSacOptional.get());
        return MauSacOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<MauSac> MauSacOptional = nvMauSacRepository.findById(Long.parseLong(id));
        nvMauSacRepository.delete(MauSacOptional.get());
    }

    @Override
    public MauSac getOne(String id) {
        Optional<MauSac> MauSacOptional = nvMauSacRepository.findById(Long.parseLong(id));
        return MauSacOptional.get();
    }
}
