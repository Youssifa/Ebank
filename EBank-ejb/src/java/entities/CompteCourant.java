/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DG
 */
@Entity
@DiscriminatorValue("CompteCourant")
public class CompteCourant extends Compte{
    private double fraisTrans;

    public CompteCourant(double fraisTrans, Long numero, double solde, String dateCreation, Agence agence, Client client) {
        super(numero, solde, dateCreation, agence, client);
        this.fraisTrans = fraisTrans;
    }

    public CompteCourant() {
     
    }

    

   
    
}
