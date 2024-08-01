package com.example.EjercicioPract.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
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
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id_factura;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "total")
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", referencedColumnName = "id_tipo_pago")
    private Tipo_Pago tipo_Pago;

    @JsonIgnore
    @OneToMany(mappedBy = "factura")
    private List<Item_Factura> item_Facturas;
}