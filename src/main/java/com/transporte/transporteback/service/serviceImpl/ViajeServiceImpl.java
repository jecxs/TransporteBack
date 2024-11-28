package com.transporte.transporteback.service.serviceImpl;

import com.transporte.transporteback.entity.Viaje;
import com.transporte.transporteback.repository.ViajeRepository;
import com.transporte.transporteback.service.ViajeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ViajeServiceImpl implements ViajeService {

    private final ViajeRepository viajeRepository;

    public ViajeServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public List<Viaje> findAll() {
        return viajeRepository.findAll();
    }

    @Override
    public Viaje findById(Long id) {
        return viajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Viaje no encontrado"));
    }

    @Override
    public Viaje save(Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    @Override
    public void deleteById(Long id) {
        viajeRepository.deleteById(id);
    }

    @Override
    public List<Viaje> findByFechaHoraSalidaAfter(LocalDateTime fechaHora) {
        return viajeRepository.findByFechaHoraSalidaAfter(fechaHora);
    }
}