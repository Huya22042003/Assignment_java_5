package com.assignment.core.nhanvien.repository;

import com.assignment.core.nhanvien.model.response.NvMauSacResponse;
import com.assignment.repository.MauSacRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface NvMauSacRepository extends MauSacRepository {


    @Query(value = """
            SELECT ca.id, ca.ma_mau_sac, ca.ten_mau_sac
            FROM mau_sac ca
            """, countQuery = """
            SELECT COUNT(ca.id)
            FROM mau_sac ca
            """, nativeQuery = true)
    Page<NvMauSacResponse> getAllMauSac(Pageable pageable);
}
