package com.visiontech.serviceimple;


import com.visiontech.dto.DTORoute;
import com.visiontech.entities.Ruta;
import com.visiontech.entities.Usuario;
import com.visiontech.repositories.RutaRepository;
import com.visiontech.repositories.UsuarioRepository;
import com.visiontech.services.ServiceRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RutaServiceImple implements ServiceRoute {
    @Autowired
    private ServiceRoute serviceRoute;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Ruta> list() {
        return List.of();
    }

    @Override
    public Ruta addRoute(DTORoute dtoRoute) {
        return null;
    }

    @Override
    public List<DTORoute> findAll() {
        return List.of();
    }

    @Override
    public DTORoute findById(int id) {
        return null;
    }

    @Override
    public DTORoute save(DTORoute dto) {
        return null;
    }

    @Override
    public DTORoute update(int id, DTORoute dto) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
