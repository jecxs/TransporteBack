package com.transporte.transporteback.controller;

import com.transporte.transporteback.entity.Viaje;
import com.transporte.transporteback.service.ViajeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeController {

    private final ViajeService viajeService;

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @GetMapping
    public List<Viaje> findAll() {
        return viajeService.findAll();
    }

    @GetMapping("/{id}")
    public Viaje findById(@PathVariable Long id) {
        return viajeService.findById(id);
    }

    @PostMapping
    public Viaje save(@RequestBody Viaje viaje) {
        return viajeService.save(viaje);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        viajeService.deleteById(id);
    }

    @GetMapping("/proximos")
    public List<Viaje> findByFechaHoraSalidaAfter(@RequestParam LocalDateTime fechaHora) {
        return viajeService.findByFechaHoraSalidaAfter(fechaHora);
    }
}
