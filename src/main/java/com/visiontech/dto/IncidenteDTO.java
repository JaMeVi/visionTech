package com.visiontech.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncidenteDTO {
    private int idIncidente;
    private String tipo;
    private String gravedad;
    private String descripcion;
    private int idRuta;
}
