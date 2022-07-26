package com.backEnd.SpringBoot.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id_Ed;
    private String titulo_Ed;
    private int fechain_Ed;
    private int fechaout_Ed;
    private String descripcion_Ed;
    private String img_Ed;

    public Educacion() {
    }

    public Educacion(Long id_Ed, String titulo_Ed, int fechain_Ed, int fechaout_Ed, String descripcion_Ed, String img_Ed) {
        this.id_Ed = id_Ed;
        this.titulo_Ed = titulo_Ed;
        this.fechain_Ed = fechain_Ed;
        this.fechaout_Ed = fechaout_Ed;
        this.descripcion_Ed = descripcion_Ed;
        this.img_Ed = img_Ed;
    }

  
}

    

