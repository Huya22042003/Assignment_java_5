package com.assignment.entity;

import com.assignment.infrastructure.constant.GioHangConstans;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Table(name = "gio_hang")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GioHang implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "idkh")
    private Long idKh;

    @Column(name = "ma_gio_hang")
    private String ma;

    @Column(name = "ngay_tao")
    private Long ngayTao;

    @Column(name = "ngay_thanh_toan")
    private Long ngayThanhToan;

    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "tinh_trang")
    private GioHangConstans tinhTrang;

}
