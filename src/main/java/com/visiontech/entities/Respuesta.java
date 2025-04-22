package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Respuesta;
    @Column(name="idTema",nullable = false)
    private String idTema;
    @Column(name="ContenidoRespuesta",nullable = false)
    private String ContenidoRespuesta;
    @Column(name="fechaRespuesta",nullable = false)
    private LocalDate fechaRespuesta;

}
