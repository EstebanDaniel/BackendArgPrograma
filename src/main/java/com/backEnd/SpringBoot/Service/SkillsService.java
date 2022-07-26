
package com.backEnd.SpringBoot.Service;

import com.backEnd.SpringBoot.Model.Skills;
import com.backEnd.SpringBoot.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class SkillsService {
    
    private final SkillsRepository skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepository skillsRepo){
    this.skillsRepo = skillsRepo;
        
    }
    
    public Skills agregarSkills (Skills skills){
        return skillsRepo.save(skills);
    }
    
    public List<Skills> buscarSkills (){
    return skillsRepo.findAll();
    
    }
    public Skills editarSkills (Skills skills){
        return skillsRepo.save(skills);
    }
    
    public void borrarSkills (Long id){
    skillsRepo.deleteById(id);
    }
    
    public Skills buscaSkillsPorId (Long id) {
    return skillsRepo.findById(id).orElse(null);
        
    }
    
    
    
}
