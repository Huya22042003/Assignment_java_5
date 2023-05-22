package com.assignment.core.khachHang.service.impl;

import com.assignment.core.common.base.PageableObject;
import com.assignment.core.khachHang.model.request.KhAddSanPhamGioHang;
import com.assignment.core.khachHang.model.request.KhCreateGioHangRequest;
import com.assignment.core.khachHang.model.request.KhUpdateGioHangRequest;
import com.assignment.core.khachHang.model.response.KhGioHangChiTietResponse;
import com.assignment.core.khachHang.model.response.KhGioHangResponse;
import com.assignment.core.khachHang.repository.KhGioHangChiTietRepository;
import com.assignment.core.khachHang.repository.KhGioHangRepository;
import com.assignment.core.khachHang.service.KhGioHangService;
import com.assignment.entity.GioHang;
import com.assignment.entity.GioHangChiTiet;
import com.assignment.entity.GioHangChiTietId;
import com.assignment.infrastructure.contants.GioHangConstans;
import com.assignment.infrastructure.contants.KhachHangTestContants;
import com.assignment.infrastructure.contants.PaginationConstant;
import com.assignment.utils.DateTimeUtil;
import com.assignment.utils.GeneraterMa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KhGioHangServiceImpl implements KhGioHangService {

    @Autowired
    private KhGioHangRepository gioHangRepository;

    @Autowired
    private KhGioHangChiTietRepository gioHangChiTietRepository;

    @Override
    public PageableObject<KhGioHangResponse> getAllById(int page) {
        Pageable pageable = PageRequest.of(page, PaginationConstant.DEFAULT_SIZE);
        Page<KhGioHangResponse> pages = gioHangRepository.getListById(KhachHangTestContants.ID_KHACH_HANG, pageable);
        return new PageableObject<>(pages);
    }

    @Override
    public PageableObject<KhGioHangChiTietResponse> getAllSanPhamGioHang(int page, Long idGh) {
        Pageable pageable = PageRequest.of(page, PaginationConstant.DEFAULT_SIZE);
        Page<KhGioHangChiTietResponse> pages = gioHangChiTietRepository.
                getAllGioHangChiTiet(KhachHangTestContants.ID_KHACH_HANG, pageable);
        return new PageableObject<>(pages);
    }

    @Override
    public boolean themGioHang(KhCreateGioHangRequest createGioHangRequest) {
        try {
            GioHang gh = new GioHang();
            gh.setDiaChi(createGioHangRequest.getDiaChi());
            gh.setIdKh(KhachHangTestContants.ID_KHACH_HANG);
            gh.setMa(GeneraterMa.gen("GH"));
            gh.setNgayTao(DateTimeUtil.convertDateToTimeStampSecond());
            gh.setSdt(createGioHangRequest.getSdt());
            gh.setTenNguoiNhan(createGioHangRequest.getTenNguoiNhan());
            gh.setTinhTrang(GioHangConstans.DANG_MUA_HANG);
            gioHangRepository.save(gh);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true ;
    }

    @Override
    public boolean suaGioHang(KhUpdateGioHangRequest updateGioHangRequest, Long id) {
        try {
            Optional<GioHang> optionalGioHang = gioHangRepository.findById(id);
            if (!optionalGioHang.isEmpty()) {
                GioHang gh = optionalGioHang.get();
                gh.setDiaChi(updateGioHangRequest.getDiaChi());
                gh.setSdt(updateGioHangRequest.getGetSdt());
                gh.setTenNguoiNhan(updateGioHangRequest.getTenNguoiNhan());
                gioHangRepository.save(gh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean xoaGioHang(Long id) {
        try {
            Optional<GioHang> optionalGioHang = gioHangRepository.findById(id);
            if (!optionalGioHang.isEmpty()) {
                GioHang gh = optionalGioHang.get();
                gh.setTinhTrang(GioHangConstans.DA_HUY);
                gioHangRepository.save(gh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true ;
    }

    @Override
    public boolean thanhToanGioHang(Long id) {
        try {
            Optional<GioHang> optionalGioHang = gioHangRepository.findById(id);
            if (!optionalGioHang.isEmpty()) {
                GioHang gh = optionalGioHang.get();
                gh.setNgayThanhToan(DateTimeUtil.convertDateToTimeStampSecond());
                gh.setTinhTrang(GioHangConstans.HOAN_THANH);
                gioHangRepository.save(gh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean themSanPhamVaoGioHang(KhAddSanPhamGioHang addSanPhamGioHang, Long idSanPham, Long idGioHang) {
        try {
            GioHangChiTiet gioHangChiTiet = new GioHangChiTiet();
            gioHangChiTiet.setIdGioHang(idGioHang);
            gioHangChiTiet.setIdChiTietSp(idSanPham);
            gioHangChiTiet.setSoLuong(addSanPhamGioHang.getSoLuongMua());
            gioHangChiTiet.setDonGia(addSanPhamGioHang.getDonGia());
            gioHangChiTiet.setDonGiaKhiGiam(addSanPhamGioHang.getDonGiaKhiGiam());
            gioHangChiTietRepository.save(gioHangChiTiet);
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateGioHang(KhAddSanPhamGioHang addSanPhamGioHang, Long idSanPham, Long idGioHang) {
        try {
            GioHangChiTietId gioHangChiTietId = new GioHangChiTietId(idGioHang, idSanPham);
            Optional<GioHangChiTiet> optionalGioHangChiTiet = gioHangChiTietRepository.findById(gioHangChiTietId);
            if (!optionalGioHangChiTiet.isEmpty()) {
                GioHangChiTiet gioHangChiTiet = optionalGioHangChiTiet.get();
                gioHangChiTiet.setIdGioHang(idGioHang);
                gioHangChiTiet.setIdChiTietSp(idSanPham);
                gioHangChiTiet.setSoLuong(addSanPhamGioHang.getSoLuongMua());
                gioHangChiTiet.setDonGia(addSanPhamGioHang.getDonGia());
                gioHangChiTiet.setDonGiaKhiGiam(addSanPhamGioHang.getDonGiaKhiGiam());
                gioHangChiTietRepository.save(gioHangChiTiet);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean xoaSanPham(Long idSanPham, Long idGioHang) {
        try {
            GioHangChiTietId gioHangChiTietId = new GioHangChiTietId(idGioHang, idSanPham);
            Optional<GioHangChiTiet> optionalGioHangChiTiet = gioHangChiTietRepository.findById(gioHangChiTietId);
            if (!optionalGioHangChiTiet.isEmpty()) {
                GioHangChiTiet gioHangChiTiet = optionalGioHangChiTiet.get();
                gioHangChiTietRepository.delete(gioHangChiTiet);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }


}
