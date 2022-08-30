/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DG
 */
@Entity
@Table(name = "Agence")
public class Agence implements Serializable{

    @Id
    @GeneratedValue
    private Long idAgence;
    @Column(name = "nom_agance")
    private String nomAgance;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(targetEntity = Compte.class, mappedBy = "agence")
    private List<Compte> comptes = new ArrayList<>();

    public Agence(Long idAgence, String nomAgance, String telephone) {
        this.idAgence = idAgence;
        this.nomAgance = nomAgance;
        this.telephone = telephone;
    }

    public Agence() {
        
    }

    

    public Long getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(Long idAgence) {
        this.idAgence = idAgence;
    }

    public String getNomAgance() {
        return nomAgance;
    }

    public void setNomAgance(String nomAgance) {
        this.nomAgance = nomAgance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
