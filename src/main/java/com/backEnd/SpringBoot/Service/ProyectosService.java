
package com.backEnd.SpringBoot.Service;

import com.backEnd.SpringBoot.Model.Proyectos;
import com.backEnd.SpringBoot.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    
    private final ProyectosRepository proyectosRepo;
    
    @Autowired
    public ProyectosService (ProyectosRepository proyectosRepo){
    this.proyectosRepo = proyectosRepo;
        
    }
    
     public Proyectos agregarProyectos (Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    
    public List<Proyectos> buscarProyectos (){
    return proyectosRepo.findAll();
    
    }
    public Proyectos editarProyectos (Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    
    public void borrarProyectos (Long id){
    proyectosRepo.deleteById(id);
    }
    
    public Proyectos buscaProyectosPorId (Long id) {
    return proyectosRepo.findById(id).orElse(null);
        
    }
    
    
    
    
    
    
    
    
    
    
}
