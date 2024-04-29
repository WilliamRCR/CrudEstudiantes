package com.william.Estudiantes.dao;

import com.william.Estudiantes.entities.Estudiantes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstudiantesDao extends CrudRepository<Estudiantes, Long> {
    List<Estudiantes> findByNombre(String nombre);
}
