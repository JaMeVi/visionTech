package com.visiontech.serviceimple;

import com.visiontech.entities.Metrica;
import com.visiontech.repositories.MetricasRepository;
import com.visiontech.services.MetricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricaServiceImplements implements MetricaService {
  @Autowired
    private MetricasRepository mR;

    public List<Metrica> list() {return mR.findAll();}
    public void insert(Metrica m) {mR.save(m);}
    public Metrica listId(int idMetrica) {return mR.findById(idMetrica).orElse(new Metrica());}
    public void update(Metrica m) {mR.save(m);}
    public void delete(int idMetrica) {mR.deleteById(idMetrica);}

}
