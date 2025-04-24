package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="notificaciones")

public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;

    @Column(name="titulo",nullable = false,length = 40)
    private String titulo;

    @Column(name="contenido",nullable = false,length = 40)
    private String contenido;

    @Column(name="fecha_hora",nullable = false)
    private LocalDate fechaHora;

    @ManyToOne
    @JoinColumn(name="idRuta")
    private Ruta ruta;
}
