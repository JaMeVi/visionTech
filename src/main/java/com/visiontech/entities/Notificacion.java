package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="notificaciones")

public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_notificacion;
    @Column(name="titulo",nullable = false,length = 40)
    private String titulo;
    @Column(name="contenido",nullable = false,length = 40)
    private String contenido;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_hora;

    @ManyToOne
    @JoinColumn(name="id_ruta")
    private Ruta ruta;
}
