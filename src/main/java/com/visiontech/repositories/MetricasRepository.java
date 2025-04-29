package com.visiontech.repositories;

import com.visiontech.entities.Metrica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricasRepository extends JpaRepository<Metrica,Integer> {
}
