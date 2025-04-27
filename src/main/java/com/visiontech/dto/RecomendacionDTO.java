package com.visiontech.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecomendacionDTO {
    private int idRecomendacion;
    private String comentario;
    private int puntuacion;
    private int idRuta;

}
