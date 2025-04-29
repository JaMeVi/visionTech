package com.visiontech.services;

import com.visiontech.entities.CondicionAtmosferica;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CAtmosfericaService {

    public List<CondicionAtmosferica> list();
    public void insert(CondicionAtmosferica ca);
    public CondicionAtmosferica listId(int idCondicionAtmosferica);
    public void update(CondicionAtmosferica ca);
    public void delete(int idCondicionAtmosferica);
}
