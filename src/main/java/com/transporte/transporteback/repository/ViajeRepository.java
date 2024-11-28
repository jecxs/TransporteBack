package com.transporte.transporteback.repository;

import com.transporte.transporteback.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ViajeRepository extends JpaRepository<Viaje, Long> {
    List<Viaje> findByFechaHoraSalidaAfter(LocalDateTime fechaHora);
    List<Viaje> findByConductorId(Long conductorId);
    List<Viaje> findByVehiculoId(Long vehiculoId);
}