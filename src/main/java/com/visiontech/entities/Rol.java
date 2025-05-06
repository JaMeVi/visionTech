package com.visiontech.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","rol"})} )
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name="Rol",nullable = false,length = 40)
    private String rol;

    public Rol() {}

    public Rol(Long idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }

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

}
