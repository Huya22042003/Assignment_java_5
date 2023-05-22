package com.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "khach_hang")
@Entity
public class KhachHang {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
    
    @Column(name = "ma")
    private String ma;
    
    @Column(name = "ten")
    private String ten;
    
    @Column(name = "ngay_sinh")
    private Long ngaySinh;
    
    @Column(name = "sdt")
    private String sdt;
    
    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "mat_khau")
    private String matKhau;

}
