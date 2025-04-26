package com.visiontech.serviceimple;

import com.visiontech.entities.Respuesta;
import com.visiontech.repositories.RespuestaRepository;
import com.visiontech.services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaServiceImple implements RespuestaService {
    @Autowired
    private RespuestaRepository rR;

    @Override
    public List<Respuesta> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Respuesta a) {
        rR.save(a);
    }

    @Override
    public Respuesta listId(int idRespuesta) {
        return rR.findById(idRespuesta).orElse(new Respuesta());
    }

    @Override
    public void update(Respuesta a) {
        rR.save(a);
    }

    @Override
    public void delete(int idRespuesta) {
        rR.deleteById(idRespuesta);
    }
}
