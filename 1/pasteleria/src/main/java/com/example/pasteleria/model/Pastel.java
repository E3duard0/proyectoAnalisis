package com.example.pasteleria.model;

import javax.persistence.*;

@Entity
public class Pastel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private Integer id;
    private String nombre;

    private String ingredientes;

    private Integer precio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return ingredientes;
    }

    public void setDescripcion(String descripcion) {
        this.ingredientes = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
