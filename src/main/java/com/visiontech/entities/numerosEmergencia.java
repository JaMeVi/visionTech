package com.visiontech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="numeros_emergencia")
public class numerosEmergencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNumeroEmergencia;

    @Column(name="tipoEmergencia",nullable = false,length = 10)
    private String tipoEmergencia;

    @Column(name="distrito",nullable = false,length = 40)
    private String distrito;

    @Column(name="telefonoEmergencia",nullable = false)
    private int telefonoEmergencia;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
}
