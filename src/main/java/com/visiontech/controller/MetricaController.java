package com.visiontech.controller;

import com.visiontech.dto.MetricasDTO;
import com.visiontech.entities.Metrica;
import com.visiontech.services.MetricaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metricas")
public class MetricaController{

    @Autowired
    private MetricaService mS;

    @GetMapping
    public List<MetricasDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, MetricasDTO.class) ;
    }).collect(Collectors.toList()) ;
    }

    @PostMapping
    public void insertar(@RequestBody MetricasDTO mDto){
    ModelMapper modelMapper = new ModelMapper();
        Metrica m = modelMapper.map(mDto, Metrica.class);
        mS.insert(m);
    }

    @PutMapping
    public void modificar(@RequestBody MetricasDTO mDto){
    ModelMapper modelMapper = new ModelMapper();
    Metrica m = modelMapper.map(mDto, Metrica.class);
    mS.update(m);
    }

    @DeleteMapping("/{idMetrica}")
    public void eliminar(@PathVariable("idMetrica") int idMetrica){mS.delete(idMetrica);}

}
