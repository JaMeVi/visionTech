package com.visiontech.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTORoute {
    private int idRuta;
    private String nombreRuta;
    private String destino;
    private String inicio;
    private String fin;
    private int distanciaMinutos;
    private int tiempoRuta;
    private int longitud;
    private int latitud;
    private int idUsuario;
    private String listarRoute;
    private String addRoute;
}





