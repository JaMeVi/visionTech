package com.visiontech.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="temasForo")
public class TemaForo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTema;

    @Column(name="tituloTema",nullable = false,length = 40)
    private int tituloTema;

    @Column(name="comentario",nullable = false,length = 40)
    private int comentario;

    @Column(name="fechaCreacion",nullable = false)
    private LocalDate fechaCreacion;

    @Column(name="estadoCerrado",nullable = false)
    private boolean estadoCerrado;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
}
