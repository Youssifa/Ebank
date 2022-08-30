/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author DG
 */
@Entity
@DiscriminatorValue("CompteEpargne")
public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(double tauxInteret, Long numero, double solde, String dateCreation, Agence agence, Client client) {
        super(numero, solde, dateCreation, agence, client);
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne() {
        
    }

    
    
}
