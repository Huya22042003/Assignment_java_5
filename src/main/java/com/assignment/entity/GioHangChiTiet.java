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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "gio_hang_chi_tiet")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(GioHangChiTietId.class)
public class GioHangChiTiet implements Serializable {

    @Id
    @Column(name = "id_gio_hang")
    private Long idGioHang;

    @Id
    @Column(name = "id_chi_tiet_sp")
    private Long idChiTietSp;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "don_gia")
    private BigDecimal donGia;

    @Column(name = "don_gia_khi_giam")
    private BigDecimal donGiaKhiGiam;

}
