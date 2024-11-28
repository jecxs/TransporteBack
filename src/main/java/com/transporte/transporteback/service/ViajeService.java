package com.transporte.transporteback.service;


import com.transporte.transporteback.entity.Viaje;

import java.time.LocalDateTime;
import java.util.List;

public interface ViajeService {
    List<Viaje> findAll();
    Viaje findById(Long id);
    Viaje save(Viaje viaje);
    void deleteById(Long id);
    List<Viaje> findByFechaHoraSalidaAfter(LocalDateTime fechaHora);
}