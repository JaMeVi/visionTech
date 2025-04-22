package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor



@Entity
@Table(name="Rutas")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;
    private String nombreRuta;
    private String destinoRuta;
    private String inicioRuta;
    private String finRuta;
    private int distanciaRuta;
    private int tiempoRuta;
    private int longitudRuta;
    private int latitudRuta;



}
