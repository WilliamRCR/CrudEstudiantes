package controllers;

import entities.Estudiantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.EstudianteService;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public List<Estudiantes> GetAll(){
        return estudianteService.findAll();
    }

    @GetMapping(value="/{id}")
    public Estudiantes buscarPorId(@PathVariable Long id){
        return estudianteService.buscarPorId(id);
    }

    @GetMapping(value="/{nombre}")
    public List<Estudiantes> buscarPorNombre(@RequestParam String nombre){return estudianteService.buscarPorNombre(nombre);}

    @PostMapping
    public void ingresar(@RequestBody Estudiantes estudiante){
        estudianteService.ingresar(estudiante);
    }

    @PutMapping(value="/{id}")
    public void modificar (@PathVariable Long id,
                        @RequestBody Estudiantes product){
        estudianteService.modificar(id, product);
    }

    @DeleteMapping(value="/{id}")
    public void eliminar(@PathVariable Long id){
        estudianteService.eliminar(id);
    }
}
