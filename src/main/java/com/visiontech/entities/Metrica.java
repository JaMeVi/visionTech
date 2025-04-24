package com.visiontech.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "metricas")
public class Metrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMetrica;

    @Column(name = "numeroPasos", nullable = false)
    private int numeroPasos;

    @Column(name = "caloriaQuemadas", nullable = false)
    private int caloriasQuemadas;

    @Column(name = "tiempoEfectivoMinutos", nullable = false)
    private int tiempoEfectivoMinutos;

    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

    @OneToOne
    @JoinColumn(name = "idRuta")
    private Ruta ruta;
}
