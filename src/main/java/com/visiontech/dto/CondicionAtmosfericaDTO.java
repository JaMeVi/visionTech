package com.visiontech.dto;

import com.visiontech.entities.Ruta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CondicionAtmosfericaDTO {

    private int idCondicionAtmosferica;
    private int humedad;
    private double temperatura;
    private int velocidadViento;
    private LocalDate fechaHora;
    private Ruta ruta;
}

