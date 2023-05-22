package com.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "chi_tiet_san_pham")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSanPham {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "id_sp")
    private Long idSanPham;

    @Column(name = "id_nsx")
    private Long idNsx;

    @Column(name = "id_mau_sac")
    private Long idMauSac;

    @Column(name = "id_dong_sp")
    private Long idDongSp;

    @Column(name = "nam_bh")
    private int namBh;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "gia_nhap")
    private BigDecimal giaNhap;

    @Column(name = "gia_ban")
    private BigDecimal giaBan;

    @Column(name = "ngay_nhap")
    private Long ngayNhap;
}
