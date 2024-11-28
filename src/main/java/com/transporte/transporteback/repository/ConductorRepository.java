package com.transporte.transporteback.repository;

import com.transporte.transporteback.entity.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
    List<Conductor> findByDisponible(boolean disponible);
}