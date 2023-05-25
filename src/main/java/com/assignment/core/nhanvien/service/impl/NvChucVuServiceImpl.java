package com.assignment.core.nhanvien.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.nhanvien.model.request.NvChucVuRequest;
import com.assignment.core.nhanvien.model.request.NvCreateChucVuRequest;
import com.assignment.core.nhanvien.model.response.NvChucVuResponse;
import com.assignment.core.nhanvien.repository.NvChucVuRepository;
import com.assignment.core.nhanvien.service.NvChucVuService;
import com.assignment.entity.ChucVu;

import java.awt.print.Pageable;
import java.util.Optional;

@Service
public class NvChucVuServiceImpl implements NvChucVuService {

    @Autowired
    private NvChucVuRepository nvChucVuRepository;

    @Override
    public PageableObject<NvChucVuResponse> getAll(NvChucVuRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<NvChucVuResponse> res = nvChucVuRepository.getAllChucVu(pageable);
        return new PageableObject<>(res);
    }

    @Override
    public ChucVu add(NvCreateChucVuRequest request) {
        ChucVu ca = new ChucVu().builder().ma(request.getMa()).ten(request.getTen()).build();
        nvChucVuRepository.save(ca);
        return ca;
    }

    @Override
    public ChucVu update(NvCreateChucVuRequest request, String id) {
        Optional<ChucVu> chucVuOptional = nvChucVuRepository.findById(Long.parseLong(id));
        chucVuOptional.get().setMa(request.getMa());
        chucVuOptional.get().setTen(request.getTen());
        nvChucVuRepository.save(chucVuOptional.get());
        return chucVuOptional.get();
    }

    @Override
    public void delete(String id) {
        Optional<ChucVu> chucVuOptional = nvChucVuRepository.findById(Long.parseLong(id));
        nvChucVuRepository.delete(chucVuOptional.get());
    }

    @Override
    public ChucVu getOne(String id) {
        Optional<ChucVu> chucVuOptional = nvChucVuRepository.findById(Long.parseLong(id));
        return chucVuOptional.get();
    }
}
