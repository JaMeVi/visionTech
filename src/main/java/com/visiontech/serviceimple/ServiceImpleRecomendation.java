package com.visiontech.serviceimple;

import com.visiontech.dto.DTORecomendation;
import com.visiontech.entities.Recomendacion;
import com.visiontech.repositories.RepositoryRecomendation;
import com.visiontech.services.ServiceRecomendation;
import com.visiontech.services.ServiceRoute;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpleRecomendation implements ServiceRecomendation {
    @Autowired
    private ServiceRecomendation serviceRecomendation;

    @Autowired
    private RepositoryRecomendation repositoryRecomendation;

    @Override
    public List<DTORecomendation> findAll() {
        return List.of();
    }

    @Override
    public DTORecomendation findById(int id) {
        return null;
    }

    @Override
    public DTORecomendation save(DTORecomendation dto) {
        return null;
    }

    @Override
    public DTORecomendation delete(DTORecomendation dto) {
        return null;
    }

    @Override
    public List<Recomendacion> listarRecomendacion() {
        return List.of();
    }
}
