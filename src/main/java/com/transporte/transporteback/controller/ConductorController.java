package com.transporte.transporteback.controller;

import com.transporte.transporteback.entity.Conductor;
import com.transporte.transporteback.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductores")
public class ConductorController {

    private final ConductorService conductorService;

    public ConductorController(ConductorService conductorService) {
        this.conductorService = conductorService;
    }


    @GetMapping
    public List<Conductor> findAll() {
        return conductorService.findAll();
    }

    @GetMapping("/{id}")
    public Conductor findById(@PathVariable Long id) {
        return conductorService.findById(id);
    }

    @PostMapping
    public Conductor save(@RequestBody Conductor conductor) {
        return conductorService.save(conductor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        conductorService.deleteById(id);
    }

    @GetMapping("/disponibles")
    public List<Conductor> findByDisponible(@RequestParam boolean disponible) {
        return conductorService.findByDisponible(disponible);
    }
}

