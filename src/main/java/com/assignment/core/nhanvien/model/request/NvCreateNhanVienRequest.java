package com.assignment.core.nhanvien.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NvCreateNhanVienRequest {
    @NotBlank(message = "Ma is not null")
    private String ma;

    @NotBlank(message = "Ten is not null")
    private String ten;

    @NotBlank(message = "Gioi tinh is not null")
    private String gioiTinh;

    @NotNull(message = "Ngay sinh is not null")
    private Long ngaySinh;

    @NotBlank(message = "Dia chi is not null")
    private String diaChi;

    @NotBlank(message = "Sdt is not null")
    private String sdt;

    @NotBlank(message = "Mat khau is not null")
    private String matKhau;

    @NotNull(message = "Trang thai is not null")
    private Integer trangThai;

    private Long idCh;

    private Long idCv;

    private Long idGuiBc;
}
