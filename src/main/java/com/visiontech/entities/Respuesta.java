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
@Table(name="respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;

    @Column(name="respuesta",nullable = false,length = 50)
    private String respuesta;

    @Column(name="fechaRespuesta",nullable = false)
    private LocalDate fechaRespuesta;

    @ManyToOne
    @JoinColumn(name="idTema")
    private TemaForo temaForo;
}
