
package com.backEnd.SpringBoot.Repository;

import com.backEnd.SpringBoot.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository <Educacion,Long> {
    
}
