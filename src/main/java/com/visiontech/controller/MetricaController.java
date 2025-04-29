package com.visiontech.controller;

import com.visiontech.services.MetricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metricas")
public class MetricaController{

    @Autowired
    private MetricaService mS;
    @GetMapping
    public String listar(){
        return "Metricas";
    }

    @PostMapping
    public void insertar(){}

    @GetMapping("/{idMetrica}")
    public String listarId(){
        return "Metricas";
    }

    @PutMapping
    public void modificar(){}

    @DeleteMapping("/{idMetrica}")
    public void eliminar(){}

}
