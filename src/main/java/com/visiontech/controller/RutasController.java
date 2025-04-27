package com.visiontech.controller;

import com.visiontech.dto.DTORoute;
import com.visiontech.entities.Ruta;
import com.visiontech.services.ServiceRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RutasController {
    @Autowired
    ServiceRoute serviceRoute;

    @GetMapping("/rutas")
    public List<DTORoute> getAllRoute(){
        return serviceRoute.findAll();
    }
    @GetMapping("/rutas/{id}")
    public DTORoute getById(@PathVariable int id){
        return serviceRoute.findById(id);
    }
    @PostMapping("/rutas")
    public DTORoute createRoute(@RequestBody DTORoute dTORoute){
        return serviceRoute.save(dTORoute);
    }
    @PutMapping("/rutas/{id}")
    public DTORoute updateRoute(@PathVariable int id, @RequestBody DTORoute dTORoute){
        return serviceRoute.update(id, dTORoute);
    }
    @DeleteMapping("/rutas/{id}")
    public boolean deleteRoute(@PathVariable int id){
        return serviceRoute.delete(id);
    }

}
