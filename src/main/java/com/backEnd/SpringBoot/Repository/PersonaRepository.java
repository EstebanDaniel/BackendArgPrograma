
package com.backEnd.SpringBoot.Repository;

import com.backEnd.SpringBoot.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository <Persona,Long> {
    
}
