
package com.backEnd.SpringBoot.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
@Entity

public class Proyectos {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private Long id_Pro;
    private String titulo_Pro;
    private String descrip_Pro;
    private String img_Pro;
    private String repo_Pro;

    public Proyectos() {
    }

    public Proyectos(Long id_Pro, String titulo_Pro, String descrip_Pro, String img_Pro, String repo_Pro) {
        this.id_Pro = id_Pro;
        this.titulo_Pro = titulo_Pro;
        this.descrip_Pro = descrip_Pro;
        this.img_Pro = img_Pro;
        this.repo_Pro = repo_Pro;
    }
   
}