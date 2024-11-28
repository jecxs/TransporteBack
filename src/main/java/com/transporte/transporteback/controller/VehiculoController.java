package com.transporte.transporteback.controller;

import com.transporte.transporteback.entity.Vehiculo;
import com.transporte.transporteback.service.VehiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public List<Vehiculo> findAll() {
        return vehiculoService.findAll();
    }

    @GetMapping("/{id}")
    public Vehiculo findById(@PathVariable Long id) {
        return vehiculoService.findById(id);
    }

    @PostMapping
    public Vehiculo save(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.save(vehiculo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        vehiculoService.deleteById(id);
    }

    @GetMapping("/disponibles")
    public List<Vehiculo> findByEnServicio(@RequestParam boolean enServicio) {
        return vehiculoService.findByEnServicio(enServicio);
    }
}