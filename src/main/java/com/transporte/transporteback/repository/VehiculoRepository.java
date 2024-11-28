package com.transporte.transporteback.repository;

import com.transporte.transporteback.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    List<Vehiculo> findByEnServicio(boolean enServicio);
}