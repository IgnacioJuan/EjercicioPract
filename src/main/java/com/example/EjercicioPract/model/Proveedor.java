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
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer id_proveedor;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "pais")
    private String pais;
    @Column(name = "correo")
    private String correo;
    @Column(name = "moneda")
    private String moneda;

    @JsonIgnore
    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos;
}
