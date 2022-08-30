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
@Table(name = "Client")
public class Client implements Serializable{

    @Id
    @GeneratedValue
    private Long idClient;
    @Column(name = "nom")
    private String nom;
    @Column(name = "adresse")
    private String adresse;
    @OneToMany(targetEntity = Compte.class, mappedBy = "client")
    private List<Compte> comptes = new ArrayList<>();

    public Client(Long idClient, String nom, String adresse) {
        this.idClient = idClient;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Client() {
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
