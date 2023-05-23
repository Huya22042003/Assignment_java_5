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

@Table(name = "hoa_don")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "idkh")
    private Long idKh;

    @Column(name = "idnv")
    private Long idNv;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ngay_tao")
    private Long ngayTao;

    @Column(name = "ngay_thanh_toan")
    private Long ngayThanhToan;

    @Column(name = "ngay_ship")
    private Long ngayShip;

    @Column(name = "ngay_nhan")
    private Long ngayNhan;

    @Column(name = "tinh_trang")
    private int tinhTrang;

    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

}
