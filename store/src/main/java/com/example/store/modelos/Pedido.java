package com.example.store.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="Pedido")
public class Pedido {

    @Id
    private Integer id;
    private LocalDateTime FechaYHora;

}
