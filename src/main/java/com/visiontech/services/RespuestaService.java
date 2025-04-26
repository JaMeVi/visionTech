package com.visiontech.services;

import com.visiontech.entities.Respuesta;

import java.util.List;

public interface RespuestaService {
    public List<Respuesta> list();

    public void insert(Respuesta respuesta);

    public Respuesta listId(int idRespuesta);
    public void update(Respuesta respuesta);
    public void delete(int idRespuesta);
}
