package com.transporte.transporteback.service;

import com.transporte.transporteback.entity.Vehiculo;

import java.util.List;

public interface VehiculoService {
    List<Vehiculo> findAll();
    Vehiculo findById(Long id);
    Vehiculo save(Vehiculo vehiculo);
    void deleteById(Long id);
    List<Vehiculo> findByEnServicio(boolean enServicio);
}
