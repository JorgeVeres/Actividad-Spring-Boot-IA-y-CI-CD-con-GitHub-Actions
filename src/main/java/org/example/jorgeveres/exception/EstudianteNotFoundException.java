package org.example.jorgeveres.exception;

public class EstudianteNotFoundException extends RuntimeException {
    public EstudianteNotFoundException(Long id) {
        super("Estudiante no encontrado con id: " + id);
    }
}