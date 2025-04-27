package com.visiontech.services;

import com.visiontech.entities.Incidente;

import java.util.List;

public interface IncidenteService {
    public List<Incidente> list();
    public void insert(Incidente i);
    public Incidente listId(int idIncidente);
    public void update(Incidente i);
    public void delete(int idIncidente);
    public List<Incidente> buscarPorTipo(String tipo);
}
