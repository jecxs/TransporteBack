package com.transporte.transporteback.controller;

import com.transporte.transporteback.entity.Cliente;
import com.transporte.transporteback.service.ClienteService;
import com.transporte.transporteback.service.serviceImpl.ReniecService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ReniecService reniecService;
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService, ReniecService reniecService) {
        this.clienteService = clienteService;
        this.reniecService = reniecService;
    }

    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
    @GetMapping("/buscar-dni/{dni}")
    public ResponseEntity<Cliente> buscarPorDni(@PathVariable String dni) {
        Cliente cliente = reniecService.obtenerDatosPorDni(dni);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}