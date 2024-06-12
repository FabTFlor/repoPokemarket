package org.generation.pokemarket.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue
    @Column(name = "id_producto")
    private int id;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "stock")
    private int stock;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private double precio;

    @Column(name = "imagen_url")
    private String imagenUrl;

    @Column(name = "categoria")
    private String categoria;

    @CreationTimestamp
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;


}
