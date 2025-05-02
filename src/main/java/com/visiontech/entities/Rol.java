package com.visiontech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="roles")
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name="Rol",nullable = false,length = 40)
    private String rol;

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String nombreRol) {
        this.rol = nombreRol;
    }

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Rol() {}

    public Rol(Long idRol, String rol, Usuario usuario) {
        this.idRol = idRol;
        this.rol = rol;
        this.usuario = usuario;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
