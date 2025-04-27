package com.visiontech.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTORecomendation {
    private Long idRecomendacion;
    private String comentario;
    private String puntuacion;
    private Long idRuta;

}
