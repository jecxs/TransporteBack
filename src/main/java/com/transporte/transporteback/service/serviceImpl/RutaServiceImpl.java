package com.transporte.transporteback.service.serviceImpl;

import com.transporte.transporteback.entity.Ruta;
import com.transporte.transporteback.repository.RutaRepository;
import com.transporte.transporteback.service.RutaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutaServiceImpl implements RutaService {

    private final RutaRepository rutaRepository;

    public RutaServiceImpl(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    @Override
    public List<Ruta> findAll() {
        return rutaRepository.findAll();
    }

    @Override
    public Ruta findById(Long id) {
        return rutaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ruta no encontrada"));
    }

    @Override
    public Ruta save(Ruta ruta) {
        return rutaRepository.save(ruta);
    }

    @Override
    public void deleteById(Long id) {
        rutaRepository.deleteById(id);
    }
}