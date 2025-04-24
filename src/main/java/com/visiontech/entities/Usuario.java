package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name="nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name="contrasena",nullable = false,length = 45)
    private String contrasena;

    @Column(name="correoElectronico",nullable = false,length = 45)
    private String correoElectronico;

    @Column(name="telefono",nullable = false)
    private int telefono;

    @ManyToOne
    @JoinColumn(name="idRol")
    private Roles idRol;



}
