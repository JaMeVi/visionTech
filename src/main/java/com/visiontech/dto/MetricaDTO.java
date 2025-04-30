package com.visiontech.dto;

import com.visiontech.entities.Ruta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetricaDTO {

    private int idMetrica;
    private int numeroPasos;
    private int caloriasQuemadas;
    private int tiempoEfectivoMinutos;
    private LocalDate fecha;
    private Ruta ruta;
}
