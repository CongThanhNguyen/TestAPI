package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Ten")
    @NotNull(message = "Trường này không được để trống !")
    private String ten;

    @Min(value = 10)
    @Max(value = 50)
    @Column(name = "Tuoi")
    private Integer tuoi;


}
