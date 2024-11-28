package com.transporte.transporteback.service.serviceImpl;

import com.transporte.transporteback.entity.Conductor;
import com.transporte.transporteback.repository.ConductorRepository;
import com.transporte.transporteback.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorServiceImpl implements ConductorService {


    private final ConductorRepository conductorRepository;

    public ConductorServiceImpl(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    @Override
    public List<Conductor> findAll() {
        return conductorRepository.findAll();
    }

    @Override
    public Conductor findById(Long id) {
        return conductorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conductor no encontrado"));
    }

    @Override
    public Conductor save(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    @Override
    public void deleteById(Long id) {
        conductorRepository.deleteById(id);
    }

    @Override
    public List<Conductor> findByDisponible(boolean disponible) {
        return conductorRepository.findByDisponible(disponible);
    }
}