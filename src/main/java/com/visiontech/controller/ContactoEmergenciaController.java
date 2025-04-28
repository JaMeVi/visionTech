package com.visiontech.controller;

import com.visiontech.entities.Contacto_emergencia;
import com.visiontech.services.ContactoEmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/contactos-emergencia")
public class ContactoEmergenciaController {

    @Autowired
    private ContactoEmergenciaService contactoEmergenciaService;

    @GetMapping("/busquedas")
    public List<Contacto_emergencia> buscarContactosPorNombre(@RequestParam String nombre) {
        return contactoEmergenciaService.buscarPorNombre(nombre);
    }
}
