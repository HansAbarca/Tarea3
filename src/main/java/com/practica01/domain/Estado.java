package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;

    private String nombre;
    private String capital;
    private int poblacion;
    private int cantidad_decostas;

    public Estado() {
    }

    public Estado(Long idEstado, String nombre, String capital, int poblacion, int cantidad_decostas) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.cantidad_decostas = cantidad_decostas;
    }
    
    
}
