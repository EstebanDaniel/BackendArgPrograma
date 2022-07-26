
package com.backEnd.SpringBoot.Controller;


import com.backEnd.SpringBoot.Model.Skills;
import com.backEnd.SpringBoot.Service.SkillsService;
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
@RequestMapping("api/skills")
public class SkillsController {
    
         private final SkillsService skillsService; 
         
         public SkillsController(SkillsService skillsService){
         this.skillsService = skillsService;
         
         }
         
         @GetMapping ("/all") 
   public ResponseEntity<List <Skills>> obtenerSkills() {
   
       List<Skills> skills=skillsService.buscarSkills();
       return new ResponseEntity <> (skills, HttpStatus.OK);
       
   }
    @PutMapping ("/edit")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
    Skills actualizarSkills = skillsService.editarSkills(skills);
    return new ResponseEntity<> (actualizarSkills,HttpStatus.OK);
        
    }
    
    @PostMapping ("/add")
   
    public ResponseEntity<Skills> crearSkills (@RequestBody Skills skills){
    Skills nuevaSkills  = skillsService.agregarSkills(skills);
    return new ResponseEntity<> (nuevaSkills,HttpStatus.CREATED);  
    
    }
    
    @DeleteMapping ("/delete{id}")
    
    public ResponseEntity<?> borrarSkills(@PathVariable("id")Long id) {
    skillsService.borrarSkills(id);
    return new ResponseEntity <> (HttpStatus.OK);
    
    }   

    
     
    }
    
