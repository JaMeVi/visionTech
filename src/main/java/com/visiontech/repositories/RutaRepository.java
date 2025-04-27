package com.visiontech.repositories;

import com.visiontech.entities.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RutaRepository extends JpaRepository<Ruta, Integer> {
    @Query("Select r from Ruta r where r.nombreRuta like %:nombre%")
    public List<Ruta> buscarNombre(@Param("nombre") String nombre);
}
