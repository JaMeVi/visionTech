package com.visiontech.services;

import com.visiontech.entities.TemaForo;

import java.util.List;

public interface TemaForoService {
    public List<TemaForo> list();

    public void insert(TemaForo temaforo);

    public TemaForo listId(int idTemaForo);
    public void update(TemaForo temaforo);
    public void delete(int idTemaForo);
}
