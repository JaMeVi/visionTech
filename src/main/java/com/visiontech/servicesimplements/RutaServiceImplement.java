package com.visiontech.servicesimplements;


import com.visiontech.entities.Ruta;
import com.visiontech.servicesinterfaces.IRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visiontech.repositories.RutaRepository;

import java.util.List;

@Service
public class RutaServiceImplement implements IRutaService {
    @Autowired
    private RutaRepository rR;

    @Override
    public List<Ruta> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Ruta r) {
        rR.save(r);
    }

    @Override
    public Ruta listId(int idRuta) {
        return rR.findById(idRuta).orElse(new Ruta());
    }

    @Override
    public void update(Ruta r) {
        rR.save(r);
    }

    @Override
    public void delete(int idRuta) {
        rR.deleteById(idRuta);
    }

    @Override
    public List<Ruta> buscarPorNombre(String nombre) {
        return rR.buscarNombre(nombre);
    }

    @Override
    public void marcarFavorita(int idRuta, boolean estado) {
        Ruta ruta = rR.findById(idRuta).orElse(null);
        if (ruta != null) {
            ruta.setFavorito(estado);
            rR.save(ruta);
        }

    }

    @Override
    public List<Ruta> listarFavoritas() {
        return rR.findByFavoritoTrue();
    }

    @Override
    public double estimarCalorias(int idRuta) {
        Ruta ruta = rR.findById(idRuta).orElse(null);
        if (ruta != null) {
            return (ruta.getDistanciaMetros() / 1000.0) * 60;
        }
        return 0.0;
    }
}
