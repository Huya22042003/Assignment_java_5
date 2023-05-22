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

import java.util.UUID;

@Table(name = "mau_sac")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MauSac {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "ma_mau_sac")
    private String ma;

    @Column(name = "ten_mau_sac")
    private String ten;
}
