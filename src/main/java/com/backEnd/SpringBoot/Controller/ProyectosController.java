
package com.backEnd.SpringBoot.Controller;

import com.backEnd.SpringBoot.Model.Proyectos;
import com.backEnd.SpringBoot.Service.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/proyectos")
public class ProyectosController {
    
    private final ProyectosService proyectosService;
    
    public ProyectosController (ProyectosService proyectosService){
    this.proyectosService = proyectosService;
    
    }
    
    @GetMapping ("/all") 
   public ResponseEntity<List <Proyectos>> obtenerProyectos() {
   
       List<Proyectos> proyectos= proyectosService.buscarProyectos();
       return new ResponseEntity <> (proyectos, HttpStatus.OK);
       
   }
    @PutMapping ("/edit")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyectos){
    Proyectos actualizarProyectos= proyectosService.editarProyectos(proyectos);
    return new ResponseEntity<> (actualizarProyectos,HttpStatus.OK);
        
    }
    
    @PostMapping ("/add")
   
    public ResponseEntity<Proyectos> crearProyectos (@RequestBody Proyectos proyectos){
    Proyectos nuevaProyectos  = proyectosService.agregarProyectos(proyectos);
    return new ResponseEntity<> (nuevaProyectos,HttpStatus.CREATED);  
    
    }
    
    @DeleteMapping ("/delete{id}")
    
    public ResponseEntity<?> borrarProyectos(@PathVariable("id")Long id) {
    proyectosService.borrarProyectos(id);
    return new ResponseEntity <> (HttpStatus.OK);
    
    }   


}
