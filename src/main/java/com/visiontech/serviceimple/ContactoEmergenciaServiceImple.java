package com.visiontech.serviceimple;

import com.visiontech.entities.Contacto_emergencia;
import com.visiontech.repositories.ContactoEmergenciaRepository;
import com.visiontech.services.ContactoEmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactoEmergenciaServiceImple implements ContactoEmergenciaService {

    @Autowired
    private ContactoEmergenciaRepository contactoEmergenciaRepository;

    @Override
    public List<Contacto_emergencia> list() {
        return contactoEmergenciaRepository.findAll();
    }

    @Override
    public void insert(Contacto_emergencia contactoEmergencia) {
        contactoEmergenciaRepository.save(contactoEmergencia);
    }

    @Override
    public Contacto_emergencia listId(int idContacto) {
        return contactoEmergenciaRepository.findById(idContacto).orElse(null);
    }

    @Override
    public void update(Contacto_emergencia contactoEmergencia) {
        contactoEmergenciaRepository.save(contactoEmergencia);
    }

    @Override
    public void delete(int idContacto) {
        contactoEmergenciaRepository.deleteById(idContacto);
    }

    @Override
    public List<Contacto_emergencia> buscarPorNombre(String nombre) {
        return contactoEmergenciaRepository.findByNombreContainingIgnoreCase(nombre);
    }
}
