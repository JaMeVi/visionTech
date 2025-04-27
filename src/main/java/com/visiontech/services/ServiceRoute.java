package com.visiontech.services;

import com.visiontech.dto.DTORoute;
import com.visiontech.entities.Ruta;

import java.util.List;

public interface ServiceRoute {
    public List<Ruta>  list();
    public Ruta addRoute(DTORoute dtoRoute);
    List<DTORoute> findAll();
    DTORoute findById(int id);
    DTORoute save(DTORoute dto);
    DTORoute update(int id, DTORoute dto);
    boolean delete(int id);
}