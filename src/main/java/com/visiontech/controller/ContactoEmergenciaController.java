package com.visiontech.controller;

import com.visiontech.dto.ContactoEmergenciaDTO;
import com.visiontech.entities.Contacto_emergencia;
import com.visiontech.services.ContactoEmergenciaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contactoemergencia")
public class ContactoEmergenciaController {

    @Autowired
    private ContactoEmergenciaService contactoEmergenciaService;

    @GetMapping
    public List<ContactoEmergenciaDTO> listar() {
        return contactoEmergenciaService.list().stream().map(contacto -> {
                    ModelMapper modelMapper = new ModelMapper();
                    return modelMapper.map(contacto, ContactoEmergenciaDTO.class);
                })
                .collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody ContactoEmergenciaDTO contactoEmergenciaDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Contacto_emergencia contacto = modelMapper.map(contactoEmergenciaDTO, Contacto_emergencia.class);
        contactoEmergenciaService.insert(contacto);
    }

    @GetMapping("/{idContactoEmergencia}")
    public ContactoEmergenciaDTO listId(@PathVariable("idContactoEmergencia") int idContactoEmergencia) {
        ModelMapper modelMapper = new ModelMapper();
        ContactoEmergenciaDTO dto = modelMapper.map(contactoEmergenciaService.listId(idContactoEmergencia), ContactoEmergenciaDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody ContactoEmergenciaDTO contactoEmergenciaDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Contacto_emergencia contacto = modelMapper.map(contactoEmergenciaDTO, Contacto_emergencia.class);
        contactoEmergenciaService.update(contacto);
    }

    @DeleteMapping("/{idContactoEmergencia}")
    public void delete(@PathVariable("idContactoEmergencia") int idContactoEmergencia) {
        contactoEmergenciaService.delete(idContactoEmergencia);
    }
}
