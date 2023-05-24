package com.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Table(name = "chuc_vu")
@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChucVu implements Serializable {

    @Id
    @Column(name = "id" )
    @GeneratedValue
    private Long id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

}
