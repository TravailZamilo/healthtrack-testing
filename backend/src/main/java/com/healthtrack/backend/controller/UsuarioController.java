package com.healthtrack.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private String nombre = "Camilo";
    private double peso = 70.0;

    @GetMapping
    public String obtenerUsuario() {
        return "Usuario: " + nombre + ", Peso: " + peso + " kg";
    }

    @PostMapping("/actualizar")
    public String actualizarPeso(@RequestParam String nuevoNombre, @RequestParam double nuevoPeso) {
        this.nombre = nuevoNombre;
        this.peso = nuevoPeso;
        return "Usuario actualizado: " + nombre + ", Peso: " + peso + " kg";
    }
}
