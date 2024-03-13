package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String nit;
    private String localDate;
    private String sedePrincipal;

}
