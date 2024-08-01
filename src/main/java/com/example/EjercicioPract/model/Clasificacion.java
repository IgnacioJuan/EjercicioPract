package com.example.EjercicioPract.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clasificacion")
    private Integer id_clasificacion;
    @Column(name = "grupo")
    private String grupo;

    @JsonIgnore
    @OneToMany(mappedBy = "clasificacion")
    private List<Producto> productos;
}
