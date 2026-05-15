package org.example.jorgeveres.repository;

import org.example.jorgeveres.model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository

public interface EstudianteRepository extends JpaRepository<Estudiante,  Long> {

}