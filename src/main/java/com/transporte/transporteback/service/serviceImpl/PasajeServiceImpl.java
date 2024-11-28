package com.transporte.transporteback.service.serviceImpl;

import com.transporte.transporteback.entity.Pasaje;
import com.transporte.transporteback.repository.PasajeRepository;
import com.transporte.transporteback.service.PasajeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeServiceImpl implements PasajeService {

    private final PasajeRepository pasajeRepository;

    public PasajeServiceImpl(PasajeRepository pasajeRepository) {
        this.pasajeRepository = pasajeRepository;
    }

    @Override
    public List<Pasaje> findAll() {
        return pasajeRepository.findAll();
    }

    @Override
    public Pasaje findById(Long id) {
        return pasajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pasaje no encontrado"));
    }

    @Override
    public Pasaje save(Pasaje pasaje) {
        return pasajeRepository.save(pasaje);
    }

    @Override
    public void deleteById(Long id) {
        pasajeRepository.deleteById(id);
    }

    @Override
    public List<Pasaje> findByViajeId(Long viajeId) {
        return pasajeRepository.findByViajeId(viajeId);
    }
}