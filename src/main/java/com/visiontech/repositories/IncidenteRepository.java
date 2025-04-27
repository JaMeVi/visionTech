package com.visiontech.repositories;

import com.visiontech.entities.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IncidenteRepository extends JpaRepository<Incidente, Integer> {
    @Query("Select i from Incidente i where i.tipo like %:tipo%")
    public List<Incidente> buscarTipo(@Param("tipo") String tipo);
}
