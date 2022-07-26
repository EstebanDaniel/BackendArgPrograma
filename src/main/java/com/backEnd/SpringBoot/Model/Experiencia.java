
package com.backEnd.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Experiencia {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_Exp;
    private String titulo_Exp;
    private String ocupacion_Exp;
    private int fechain_Exp;
    private int fechaout_Exp;
    private String descrip_Exp;
    private String img_Exp;
    private String empresa_Exp;

    public Experiencia() {
    }

    public Experiencia(Long id_Exp, String titulo_Exp, String ocupacion_Exp, int fechain_Exp, int fechaout_Exp, String descrip_Exp, String img_Exp, String empresa_Exp) {
        this.id_Exp = id_Exp;
        this.titulo_Exp = titulo_Exp;
        this.ocupacion_Exp = ocupacion_Exp;
        this.fechain_Exp = fechain_Exp;
        this.fechaout_Exp = fechaout_Exp;
        this.descrip_Exp = descrip_Exp;
        this.img_Exp = img_Exp;
        this.empresa_Exp = empresa_Exp;
    }

   
    
   
}