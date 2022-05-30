package com.backEnd.SpringBoot.Model;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter @Setter
@Entity 
public class Persona implements Serializable {
    
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    private String nombre;
    private String apellido;
    private String url_image ;
    private String titulo;
    private String Descripcion;
    private String prueba;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Ed")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> ExperienciaList;
    
     @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyectos> ProyectosList;
   
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> SkillsList;
   
    
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String urlImage, String titulo, String Descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.url_image = urlImage;
        this.titulo = titulo;
        this.Descripcion = Descripcion;
    }

    

  
    
    
}

   
   

