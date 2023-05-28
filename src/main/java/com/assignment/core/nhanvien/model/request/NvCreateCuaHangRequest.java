package com.assignment.core.nhanvien.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NvCreateCuaHangRequest {
    @NotBlank(message = "Ma is not null")
    private String ma;

    @NotBlank(message = "Ten is not null")
    private String ten;

    @NotBlank(message = "Dia chi is not null")
    private String diaChi;
}
