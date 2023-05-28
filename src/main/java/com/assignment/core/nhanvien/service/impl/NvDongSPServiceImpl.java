package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvDongSPRequest;
import com.assignment.core.nhanvien.model.request.NvCreateDongSPRequest;
import com.assignment.core.nhanvien.model.response.NvDongSPResponse;
import com.assignment.core.nhanvien.repository.NvDongSPRepository;
import com.assignment.core.nhanvien.service.NvDongSPService;
import com.assignment.entity.DongSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvDongSPServiceImpl implements NvDongSPService {

    @Autowired
    private NvDongSPRepository nvDongSPRepository;

    @Override
    public PageableObject<NvDongSPResponse> getAll(NvDongSPRequest request) {
        Pageable pageable =  PageRequest.of(request.getPage(), request.getSize());
        Page<NvDongSPResponse> res = nvDongSPRepository.getAllDongSP(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public DongSP add(NvCreateDongSPRequest request) {
        DongSP ca = new DongSP().builder().ma(request.getMa()).ten(request.getTen()).build();
        nvDongSPRepository.save(ca);
        return ca;
    }

    @Override
    public DongSP update(NvCreateDongSPRequest request, String id) {
        Optional<DongSP> DongSPOptional = nvDongSPRepository.findById(Long.parseLong(id));
        DongSPOptional.get().setMa(request.getMa());
        DongSPOptional.get().setTen(request.getTen());
        nvDongSPRepository.save(DongSPOptional.get());
        return DongSPOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<DongSP> DongSPOptional = nvDongSPRepository.findById(Long.parseLong(id));
        nvDongSPRepository.delete(DongSPOptional.get());
    }

    @Override
    public DongSP getOne(String id) {
        Optional<DongSP> DongSPOptional = nvDongSPRepository.findById(Long.parseLong(id));
        return DongSPOptional.get();
    }
}
