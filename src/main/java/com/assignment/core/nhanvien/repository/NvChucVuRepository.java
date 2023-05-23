package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvChucVuResponse;
import com.assignment.repository.ChuVuRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvChucVuRepository extends ChuVuRepository {


    @Query(value = """
            SELECT ca.id, ca.code, ca.name, ca.last_modified_date
            FROM category ca
            ORDER BY ca.last_modified_date DESC
            """, countQuery = """

            """, nativeQuery = true)
    Page<NvChucVuResponse> getAllCategoryByCensor(Pageable pageable);
}
