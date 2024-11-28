package com.transporte.transporteback.service.serviceImpl;

import com.transporte.transporteback.entity.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReniecService {

    @Value("${reniec.api.url}")
    private String apiUrl;

    @Value("${reniec.api.token}")
    private String apiToken;

    public Cliente obtenerDatosPorDni(String dni) {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiUrl + "?numero=" + dni;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiToken);
        headers.set("Accept", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        try {
            ResponseEntity<ReniecResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ReniecResponse.class);
            ReniecResponse reniecResponse = response.getBody();

            if (reniecResponse != null) {
                Cliente cliente = new Cliente();
                cliente.setDni(dni);
                cliente.setNombre(reniecResponse.getNombres());
                cliente.setApellidos(reniecResponse.getApellidoPaterno() + " " + reniecResponse.getApellidoMaterno());
                return cliente;
            } else {
                System.out.println("No se encontraron datos para el DNI: " + dni);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Clase interna para mapear la respuesta de la API
    public static class ReniecResponse {
        private String nombres;
        private String apellidoPaterno;
        private String apellidoMaterno;

        // Getters y setters
        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }
    }
}