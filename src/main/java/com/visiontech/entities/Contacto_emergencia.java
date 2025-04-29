package com.visiontech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "contactos_emergencia")
public class Contacto_emergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContacto;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "telefono",nullable = false)
    private int telefono;

    @Column(name = "correoElectronico",nullable = false,length = 45)
    private String correoElectronico;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;



}
