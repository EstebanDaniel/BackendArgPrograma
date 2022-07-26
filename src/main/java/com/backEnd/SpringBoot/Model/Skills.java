
package com.backEnd.SpringBoot.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private Long id_Skills;
    private String titulo_Skills;
    private String nombre_Skills;
    private String img_Skills;
    private int porcentaje_Skills;

    public Skills() {
    }

    public Skills(Long id_Skills, String titulo_Skills, String nombre_Skills, String img_Skills, int porcentaje_Skills) {
        this.id_Skills = id_Skills;
        this.titulo_Skills = titulo_Skills;
        this.nombre_Skills = nombre_Skills;
        this.img_Skills = img_Skills;
        this.porcentaje_Skills = porcentaje_Skills;
    }
    
  
}
