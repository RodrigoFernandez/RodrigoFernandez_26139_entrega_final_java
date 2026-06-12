package com.yogaenequilibrio.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "roles")
public class Rol {

    @Id
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
