package com.visiontech.controller;

import com.visiontech.dto.CAtmosfericasDTO;
import com.visiontech.entities.CondicionAtmosferica;
import com.visiontech.services.CAtmosfericaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catmosferica")
public class CAtmosfericaController {

    @Autowired
    private CAtmosfericaService cA;

    @GetMapping
    public List<CAtmosfericasDTO> listar(){
        return cA.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, CAtmosfericasDTO.class);
                }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody CAtmosfericasDTO cAtmosfericasDTO){
    ModelMapper modelMapper = new ModelMapper();
    CondicionAtmosferica ca = modelMapper.map(cAtmosfericasDTO, CondicionAtmosferica.class);
    cA.insert(ca);
    }


    @GetMapping("/{idCAtmosferica}")
    public CAtmosfericasDTO listarId(@PathVariable("idCAtmosferica") int idCAtmosferica){
        ModelMapper modelMapper = new ModelMapper();
        CAtmosfericasDTO dto = modelMapper.map(cA.listId(idCAtmosferica), CAtmosfericasDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CAtmosfericasDTO cAtmosfericasDTO){
        ModelMapper modelMapper = new ModelMapper();
        CondicionAtmosferica ca = modelMapper.map(cAtmosfericasDTO, CondicionAtmosferica.class);
        cA.update(ca);
    }

    @DeleteMapping( "/{idCAtmosferica}")
    public void eliminar(@PathVariable("idCAtmosferica") int idCAtmosferica){cA.delete(idCAtmosferica);}

}
