package com.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hoa_don_chi_tiet")
@Entity
@IdClass(HoaDonChiTietId.class)
public class HoaDonChiTiet {

    @Id
    @Column(name = "id_hoa_don")
    private Long idHoaDon;

    @Id
    @Column(name = "id_chi_tiet_sp")
    private Long idChiTietSp;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "don_gia")
    private BigDecimal donGia;

}
