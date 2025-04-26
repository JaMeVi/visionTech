package com.visiontech.services;

import com.visiontech.entities.Rol;

import java.util.List;

public interface RolService {
    public List<Rol> list();

    public void insert(Rol rol);

    public Rol listId(int idRol);
    public void update(Rol rol);
    public void delete(int idRol);
}
