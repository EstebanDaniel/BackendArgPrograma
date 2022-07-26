
package com.backEnd.SpringBoot.Repository;

import com.backEnd.SpringBoot.Model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectosRepository extends JpaRepository <Proyectos,Long> {
    
}
