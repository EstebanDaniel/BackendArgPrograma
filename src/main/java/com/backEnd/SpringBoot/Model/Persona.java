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
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String url_image;
    private String titulo;
    private String Descripcion;
    
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Ed")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Exp")
    private List<Experiencia> experienciaList;
    
     @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Pro")
    private List<Proyectos> proyectosList;
   
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Skills")
    private List<Skills> skillsList;
   
    
    
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

   
   

