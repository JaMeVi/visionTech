package com.visiontech.services;
import com.visiontech.entities.Recomendacion;
import com.visiontech.dto.RecomendacionDTO;

import java.util.List;

public interface RecomendacionService {
    public List<Recomendacion> list();
    public void insert(Recomendacion r);
    public Recomendacion listId(int idRecomendacion);
    public void update(Recomendacion r);
    public void delete(int idRecomendacion);
    public List<Recomendacion> buscarPorComentario(String comentario);
}
