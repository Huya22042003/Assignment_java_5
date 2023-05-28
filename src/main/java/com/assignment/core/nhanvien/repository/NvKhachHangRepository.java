package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvKhachHangResponse;
import com.assignment.repository.KhachHangRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvKhachHangRepository extends KhachHangRepository {


    @Query(value = """
            SELECT nv.id, nv.ma, 
            nv.ten, nv.ngay_sinh, nv.dia_chi,
            nv.sdt, nv.mat_khau
            FROM khach_hang nv
            """, countQuery = """
            SELECT COUNT(nv.id)
            FROM khach_hang nv
            """, nativeQuery = true)
    Page<NvKhachHangResponse> getAllKhachHang(Pageable pageable);
}
