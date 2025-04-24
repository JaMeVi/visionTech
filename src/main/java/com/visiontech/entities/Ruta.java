package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor



@Entity
@Table(name="rutas")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;

    @Column(name="nombreRuta",nullable = false,length = 80)
    private String nombreRuta;

    @Column(name="destino",nullable = false,length = 80)
    private String destino;

    @Column(name="inicio",nullable = false,length = 80)
    private String inicio;

    @Column(name="fin",nullable = false,length = 80)
    private String fin;

    @Column(name="distanciaMetros",nullable = false)
    private int distanciaMinutos;

    @Column(name="tiempoMinutos",nullable = false)
    private int tiempoRuta;

    @Column(name="longitud",nullable = false)
    private int longitud;

    @Column(name="latitud",nullable = false)
    private int latitud;



}
