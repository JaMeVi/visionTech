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

@Table(name = "Metricas")
public class Metrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_metricas;

    @Column(name = "numero_pasos", nullable = false)
    private int numero_pasos;

    @Column(name = "caloria_quemadas", nullable = false)
    private int caloria_quemadas;

    @Column(name = "tiempo_efectivo_minutos", nullable = false)
    private int tiempo_efectivo_minutos;

    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

    @OneToOne
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;
}
