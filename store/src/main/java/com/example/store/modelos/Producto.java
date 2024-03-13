package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String referencia;
    private int cantidadBodega;
    private int pecioUnitario;
    private String talla;
    private String descripcion;
    private String fotografia;

}
