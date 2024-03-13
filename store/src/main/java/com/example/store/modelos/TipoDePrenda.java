package com.example.store.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="TipoDePrenda")
public class TipoDePrenda {
    @Id

    private Integer id;
    private String nombre;
}
