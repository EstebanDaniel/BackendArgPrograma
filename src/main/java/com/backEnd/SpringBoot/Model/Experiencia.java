
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
    private Long idExp;
    private String OcupacionExp;
    private int fechaExp;
    private String descripExp;
    private String imgExp;

    public Experiencia(Long idExp, String OcupacionExp, int fechaExp, String descripExp, String imgExp) {
        this.idExp = idExp;
        this.OcupacionExp = OcupacionExp;
        this.fechaExp = fechaExp;
        this.descripExp = descripExp;
        this.imgExp = imgExp;
    }
    
    
}