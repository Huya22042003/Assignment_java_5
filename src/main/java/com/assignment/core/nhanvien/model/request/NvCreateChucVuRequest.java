package com.assignment.core.nhanvien.model.request;

import jakarta.validation.constraints.NotBlank;



public class NvCreateChucVuRequest {
    @NotBlank(message = "Ma is not null")
    private String ma;

    @NotBlank(message = "Ten is not null")
    private String ten;
}
