package services;

import entities.Estudiantes;

import java.util.List;

public interface EstudianteService {
    public List<Estudiantes> findAll();
    public Estudiantes buscarPorId(Long id);
    public List<Estudiantes> buscarPorNombre(String nombre);
    public void ingresar(Estudiantes estudiante);
    public void modificar(Long id, Estudiantes estudiante);
    public void eliminar(Long id);

}
