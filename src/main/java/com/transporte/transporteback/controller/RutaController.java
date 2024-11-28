package com.transporte.transporteback.controller;


import com.transporte.transporteback.entity.Ruta;
import com.transporte.transporteback.service.RutaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rutas")
public class RutaController {

    private final RutaService rutaService;

    public RutaController(RutaService rutaService) {
        this.rutaService = rutaService;
    }

    @GetMapping
    public List<Ruta> findAll() {
        return rutaService.findAll();
    }

    @GetMapping("/{id}")
    public Ruta findById(@PathVariable Long id) {
        return rutaService.findById(id);
    }

    @PostMapping
    public Ruta save(@RequestBody Ruta ruta) {
        return rutaService.save(ruta);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        rutaService.deleteById(id);
    }
}
