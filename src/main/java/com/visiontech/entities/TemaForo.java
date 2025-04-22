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
@Table(name="TemasForo")
public class TemaForo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTema;
    private String idTemaRespuesta;
    private int tituloTemaForo;
    private LocalDate fechaCreacion;
    private boolean estadoCerrado;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;
}
