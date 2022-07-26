
package com.backEnd.SpringBoot.Service;


import com.backEnd.SpringBoot.Exception.UserNotFoundException;
import com.backEnd.SpringBoot.Model.Persona;
import com.backEnd.SpringBoot.Repository.PersonaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
@Transactional
public class PersonaService {
    
    private final PersonaRepository personaRepo;

    @Autowired
    public PersonaService(PersonaRepository personaRepo) {
        this.personaRepo = personaRepo;
    }
    
     public Persona agregarPersona (Persona persona){
        return personaRepo.save(persona);
    }
    
    public List<Persona> buscarPersona (){
    return personaRepo.findAll();
    
    }
    public Persona editarPersona (Persona persona){
        return personaRepo.save(persona);
    }
    
    public void borrarPersona (Long id){
    personaRepo.deleteById(id);
    }
    
    public Persona buscarPersonaPorId (Long id) {
    return personaRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
        
    }
}