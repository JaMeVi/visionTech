package com.visiontech.services;

import com.visiontech.entities.Metrica;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MetricaService {
    public List<Metrica> list();
    public void insert(Metrica m);
    public Metrica listId(int idMetrica);
    public void update(Metrica m);
    public void delete(int idMetrica);

}
