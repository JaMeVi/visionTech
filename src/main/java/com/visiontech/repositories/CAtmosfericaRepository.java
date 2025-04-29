package com.visiontech.repositories;

import com.visiontech.entities.CondicionAtmosferica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CAtmosfericaRepository extends JpaRepository<CondicionAtmosferica, Integer> {
}
