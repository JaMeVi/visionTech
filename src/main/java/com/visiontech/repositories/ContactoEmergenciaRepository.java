package com.visiontech.repositories;

import com.visiontech.entities.Contacto_emergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContactoEmergenciaRepository extends JpaRepository<Contacto_emergencia, Integer> {
    List<Contacto_emergencia> findByNombreContainingIgnoreCase(String nombre);
}
