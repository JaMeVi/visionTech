package com.visiontech.repositories;

import com.visiontech.entities.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryIncident extends JpaRepository<Ruta, Integer> {
}
