package services;

import dao.EstudiantesDao;
import entities.Estudiantes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstudianteServiceImp implements EstudianteService{

    @Autowired
    EstudiantesDao estudiantesDao;
    @Override
    public List<Estudiantes> findAll() {
        return (List<Estudiantes>)estudiantesDao.findAll();
    }

    @Override
    public Estudiantes buscarPorId(Long id) {
        return estudiantesDao.findById(id).orElse(null);
    }

    @Override
    public List<Estudiantes> buscarPorNombre(String nombre) {
        return estudiantesDao.findByNombre(nombre);
    }

    @Override
    public void ingresar(Estudiantes estudiante) {
        estudiantesDao.save(estudiante);
    }

    @Override
    public void modificar(Long id, Estudiantes estudiante) {
        if (estudiantesDao.existsById(id)){
            estudiante.setId(id);
            estudiantesDao.save(estudiante);
        }
    }

    @Override
    public void eliminar(Long id) {
        if(estudiantesDao.existsById(id)){
            estudiantesDao.deleteById(id);
        }
    }
}
