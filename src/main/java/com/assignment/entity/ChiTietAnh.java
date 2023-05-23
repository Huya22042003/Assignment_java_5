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

@Table(name = "chi_tiet_anh")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietAnh {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "id_chi_tiet_sp")
    private Long idChiTietSp;

    @Column(name = "file_name")
    private String fileName;

}
