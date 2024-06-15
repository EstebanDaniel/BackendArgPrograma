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

    /*
     que realiza esto en java: @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Ed")
    private List<Educacion> educacionList;

    La anotación @OneToMany dentro de la entidad Persona en Java indica que hay una relación de "uno a muchos" 
    entre la entidad Persona y la entidad Educacion.

La opción fetch = FetchType.LAZY indica que la lista de instancias de Educacion en la entidad Persona se cargará solo cuando se acceda a ella. 
    Esto significa que cuando se recupera una instancia de Persona de la base de datos, la lista de Educacion asociada no se cargará inmediatamente
    en memoria, sino solo cuando se acceda a ella.

La opción mappedBy = "id_Ed" indica que la propiedad "id_Ed" en la entidad Educacion se utiliza para mapear la relación entre ambas entidades.
    Esto significa que la propiedad "id_Ed" en la entidad Educacion se refiere a la clave primaria de la entidad Persona.

La variable private List<Educacion> educacionList; se utiliza para representar la lista de instancias de Educacion que están relacionadas 
    con una instancia de Persona. Esta lista de instancias de Educacion está mapeada a través de la propiedad "id_Ed" y se cargará en memoria
    solo cuando se acceda a ella.

En resumen, el código Java @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_Ed") private List<Educacion> educacionList; dentro de la entidad 
    Persona representa una relación "uno a muchos" entre la entidad Persona y la entidad Educacion, donde la propiedad "id_Ed" en
    la entidad Educacion se utiliza para mapear la relación con la entidad Persona.
    
    */

  
    
    
}

   
   

