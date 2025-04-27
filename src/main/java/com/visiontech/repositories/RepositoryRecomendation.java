package com.visiontech.repositories;

import com.visiontech.entities.Recomendacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRecomendation extends JpaRepository<Recomendacion, Integer> {
}
