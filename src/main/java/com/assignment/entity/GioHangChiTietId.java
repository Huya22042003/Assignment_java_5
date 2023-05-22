package com.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GioHangChiTietId implements Serializable {

    private Long idGioHang;

    private Long idChiTietSp;

}
