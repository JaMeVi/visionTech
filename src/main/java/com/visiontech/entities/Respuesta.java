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
@Table(name="respuestas") //
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



    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public LocalDate getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(LocalDate fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public TemaForo getTemaForo() {
        return temaForo;
    }

    public void setTemaForo(TemaForo temaForo) {
        this.temaForo = temaForo;
    }
}
