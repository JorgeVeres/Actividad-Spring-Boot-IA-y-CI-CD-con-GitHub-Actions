package org.example.jorgeveres.controller;

import jakarta.validation.Valid;
import org.example.jorgeveres.model.Estudiante;
import org.example.jorgeveres.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @PostMapping
    public Estudiante crear(@Valid @RequestBody Estudiante estudiante) {
        return service.guardarEstudiante(estudiante);
    }

    @GetMapping
    public List<Estudiante> listarTodos() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Estudiante obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Long id, @Valid @RequestBody Estudiante datos) {
        return service.actualizarEstudiante(id, datos);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarEstudiante(id);
    }
}