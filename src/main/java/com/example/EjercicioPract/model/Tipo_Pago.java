package com.example.EjercicioPract.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tipo_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_pago")
    private Integer id_tipo_pago;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "descrip")
    private String descrip;

    @JsonIgnore
    @OneToMany(mappedBy = "tipo_Pago")
    private List<Factura> facturas;
}