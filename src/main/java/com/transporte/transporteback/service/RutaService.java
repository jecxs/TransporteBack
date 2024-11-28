package com.transporte.transporteback.service;

import com.transporte.transporteback.entity.Ruta;

import java.util.List;

public interface RutaService {
    List<Ruta> findAll();
    Ruta findById(Long id);
    Ruta save(Ruta ruta);
    void deleteById(Long id);
}
