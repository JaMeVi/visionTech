package com.visiontech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Contactos_emergencia")
public class Contacto_emergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contacto;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "telefono",nullable = false,length = 45)
    private String telefono;

    @Column(name = "correo_electronico",nullable = false,length = 45)
    private String correo_electronico;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;



}
