package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvNhanVienResponse;
import com.assignment.repository.NhanVienRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvNhanVienRepository extends NhanVienRepository {


    @Query(value = """
            SELECT nv.id, nv.ma, 
            nv.ten,nv.gioi_tinh, nv.ngay_sinh, nv.dia_chi,
            nv.sdt, nv.mat_khau, nv.trang_thai, nv.idch, nv.idcv, 
            nv.id_gui_bc
            FROM nhan_vien nv
            """, countQuery = """
            SELECT COUNT(nv.id)
            FROM nhan_vien nv
            """, nativeQuery = true)
    Page<NvNhanVienResponse> getAllNhanVien(Pageable pageable);
}
