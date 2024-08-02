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
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer id_rol;
    @Column(name = "rol")
    private String rol;
    @Column(name = "estado")
    private Boolean estado;

    @JsonIgnore
    @OneToMany(mappedBy = "rol")
    private List<Roles_Usuarios> roles_Usuarios_list;

    
    @JsonIgnore
    @OneToMany(mappedBy = "rol")
    private List<Competencias_Roles> competencias_Roles_list;
}   
