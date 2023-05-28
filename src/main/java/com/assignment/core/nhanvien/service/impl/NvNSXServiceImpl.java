package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvNSXRequest;
import com.assignment.core.nhanvien.model.request.NvCreateNSXRequest;
import com.assignment.core.nhanvien.model.response.NvNSXResponse;
import com.assignment.core.nhanvien.repository.NvNSXRepository;
import com.assignment.core.nhanvien.service.NvNSXService;
import com.assignment.entity.NSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NvNSXServiceImpl implements NvNSXService {

    @Autowired
    private NvNSXRepository nvNSXRepository;

    @Override
    public PageableObject<NvNSXResponse> getAll(NvNSXRequest request) {
        Pageable pageable =  PageRequest.of(request.getPage(), request.getSize());
        Page<NvNSXResponse> res = nvNSXRepository.getAllNSX(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public NSX add(NvCreateNSXRequest request) {
        NSX ca = new NSX().builder().ma(request.getMa()).ten(request.getTen()).build();
        nvNSXRepository.save(ca);
        return ca;
    }

    @Override
    public NSX update(NvCreateNSXRequest request, String id) {
        Optional<NSX> NSXOptional = nvNSXRepository.findById(Long.parseLong(id));
        NSXOptional.get().setMa(request.getMa());
        NSXOptional.get().setTen(request.getTen());
        nvNSXRepository.save(NSXOptional.get());
        return NSXOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<NSX> NSXOptional = nvNSXRepository.findById(Long.parseLong(id));
        nvNSXRepository.delete(NSXOptional.get());
    }

    @Override
    public NSX getOne(String id) {
        Optional<NSX> NSXOptional = nvNSXRepository.findById(Long.parseLong(id));
        return NSXOptional.get();
    }
}
