package com.visiontech.dto;

import com.visiontech.entities.Ruta;
import jakarta.persistence.*;

import java.time.LocalDate;

public class MetricasDTO {

    private int idMetrica;
    private int numeroPasos;
    private int caloriasQuemadas;
    private int tiempoEfectivoMinutos;
    private LocalDate fecha;
    private Ruta ruta;
}
