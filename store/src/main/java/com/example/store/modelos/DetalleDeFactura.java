package com.example.store.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DetalleDeFactura")
public class DetalleDeFactura {
    @Id

    private Integer id;
    private int costoTotal;
    private int cantidadProductos;


}
