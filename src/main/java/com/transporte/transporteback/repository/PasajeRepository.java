package com.transporte.transporteback.repository;

import com.transporte.transporteback.entity.Pasaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PasajeRepository extends JpaRepository<Pasaje, Long> {
    List<Pasaje> findByViajeId(Long viajeId);
}