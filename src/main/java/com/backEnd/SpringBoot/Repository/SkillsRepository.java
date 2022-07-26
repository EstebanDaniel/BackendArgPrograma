
package com.backEnd.SpringBoot.Repository;

import com.backEnd.SpringBoot.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepository extends JpaRepository <Skills,Long> {
    
}
