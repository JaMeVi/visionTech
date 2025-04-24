package com.visiontech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "incidentes")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidente;

    @Column(name = "tipo",nullable = false,length = 45)
    private String tipo;

    @Column(name = "gravedad",nullable = false,length = 45)
    private String gravedad;

    @Column(name = "descripcion",nullable = false,length = 45)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idRuta")
    private Ruta ruta;
}
