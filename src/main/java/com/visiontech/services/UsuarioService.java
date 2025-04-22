package com.visiontech.services;

import com.visiontech.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> list();

    public void insert(Usuario usuario);

    public Usuario listId(int idUsuario);
    public void update(Usuario usuario);
    public void delete(int idUsuario);

    public List<Usuario> buscarPorNombre(String nombre);
}
