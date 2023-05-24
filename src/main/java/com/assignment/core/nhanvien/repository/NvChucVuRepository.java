package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvChucVuResponse;
import com.assignment.repository.ChuVuRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvChucVuRepository extends ChuVuRepository {


    @Query(value = """
            SELECT ca.id, ca.ma, ca.ten
            FROM chuc_vu ca
            """, countQuery = """
            SELECT COUNT(ca.id)
            FROM chuc_vu ca
            """, nativeQuery = true)
    Page<NvChucVuResponse> getAllChucVu(Pageable pageable);
}
