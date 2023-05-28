package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvCuaHangResponse;
import com.assignment.repository.CuaHangRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvCuaHangRepository extends CuaHangRepository {


    @Query(value = """
            SELECT ca.id, ca.ma, ca.ten, ca.dia_chi
            FROM cua_hang ca
            """, countQuery = """
            SELECT COUNT(ca.id)
            FROM cua_hang ca
            """, nativeQuery = true)
    Page<NvCuaHangResponse> getAllCuaHang(Pageable pageable);
}
