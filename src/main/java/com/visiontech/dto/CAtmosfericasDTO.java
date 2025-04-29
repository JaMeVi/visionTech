package com.visiontech.dto;

import com.visiontech.entities.Ruta;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class CAtmosfericasDTO {

    private int idCondicionAtmosferica;
    private int humedad;
    private double temperatura;
    private int velocidadViento;
    private LocalDate fechaHora;
    private Ruta ruta;
}

