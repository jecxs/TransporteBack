package com.transporte.transporteback.service;

import com.transporte.transporteback.entity.Pasaje;

import java.util.List;

public interface PasajeService {
    List<Pasaje> findAll();
    Pasaje findById(Long id);
    Pasaje save(Pasaje pasaje);
    void deleteById(Long id);
    List<Pasaje> findByViajeId(Long viajeId);
}
