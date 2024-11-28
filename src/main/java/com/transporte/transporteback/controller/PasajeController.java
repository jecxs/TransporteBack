package com.transporte.transporteback.controller;

import com.transporte.transporteback.entity.Pasaje;
import com.transporte.transporteback.service.PasajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasajes")
public class PasajeController {

    private final PasajeService pasajeService;

    public PasajeController(PasajeService pasajeService) {
        this.pasajeService = pasajeService;
    }

    @GetMapping
    public List<Pasaje> findAll() {
        return pasajeService.findAll();
    }

    @GetMapping("/{id}")
    public Pasaje findById(@PathVariable Long id) {
        return pasajeService.findById(id);
    }

    @PostMapping
    public Pasaje save(@RequestBody Pasaje pasaje) {
        return pasajeService.save(pasaje);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        pasajeService.deleteById(id);
    }

    @GetMapping("/viaje/{viajeId}")
    public List<Pasaje> findByViajeId(@PathVariable Long viajeId) {
        return pasajeService.findByViajeId(viajeId);
    }
}
