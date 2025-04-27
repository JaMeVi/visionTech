package com.visiontech.controller;


import com.visiontech.dto.DTOIncident;
import com.visiontech.entities.Incidente;
import com.visiontech.services.ServiceRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class IncidenteController {
    @Autowired
    private IncidenteController incidenteController;

    @GetMapping("/incidentes")
    public List<DTOIncident> list() {
        return incidenteController.list().stream().map(Incidente x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DTOIncident.class);
        }).collect(Collectors.toList());
    }

}
