package com.visiontech.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;

    @Column(length = 30, unique = true)
    private String username;

    @Column(length = 200)
    private String password;

    private Boolean enabled;

    @Column(name="nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name="correoElectronico",nullable = false,length = 45)
    private String correoElectronico;

    @Column(name="telefono",nullable = false)
    private int telefono;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="idRol")
    private List<Rol> rol;

}
