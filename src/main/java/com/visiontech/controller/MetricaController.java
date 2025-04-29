package com.visiontech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metricas")
public class MetricaController{

    @Autowired
    private MetricaController mC;

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
