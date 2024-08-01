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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id_persona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private String dni;
    @Column(name = "celular")
    private String celular;
    @Column(name = "correo")
    private String correo;

    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Factura> Facturas;

    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Usuario> usuarios;
}