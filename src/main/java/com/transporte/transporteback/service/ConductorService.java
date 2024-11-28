package com.transporte.transporteback.service;

import com.transporte.transporteback.entity.Conductor;

import java.util.List;

public interface ConductorService {
    List<Conductor> findAll();
    Conductor findById(Long id);
    Conductor save(Conductor conductor);
    void deleteById(Long id);
    List<Conductor> findByDisponible(boolean disponible);
}
