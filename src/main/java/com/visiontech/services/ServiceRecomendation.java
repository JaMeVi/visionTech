package com.visiontech.services;
import com.visiontech.entities.Recomendacion;
import com.visiontech.dto.DTORecomendation;

import java.util.List;

public interface ServiceRecomendation {
    List<DTORecomendation> findAll();
    DTORecomendation findById(int id);
    DTORecomendation save(DTORecomendation dto);
    DTORecomendation delete(DTORecomendation dto);
    public List<Recomendacion> listarRecomendacion();
}
