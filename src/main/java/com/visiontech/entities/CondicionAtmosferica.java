package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="condiciones_atmosfericas")
public class CondicionAtmosferica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCondicionAtmosferica;

    @Column(name="humedad",nullable = false)
    private int humedad;

    @Column(name="temperatura",nullable = false)
    private double temperatura;

    @Column(name="velocidadViento",nullable = false)
    private int velocidadViento;

    @Column(name="fechaHora",nullable = false)
    private LocalDate fechaHora;

    @ManyToOne //ccc
    @JoinColumn(name="idRuta")
    private Ruta ruta;
}