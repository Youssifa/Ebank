/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author DG
 */
@Entity 
@Table(name = "Transaction")
public class Transaction implements Serializable{
    
    @Id
    @GeneratedValue
    private Long idTransaction;
    @Column(name= "date_transaction")
    private String dateTransaction;
    @Column(name= "montant")
    private double montant;
    @Column(name= "type_transaction")
    private String typeTransaction;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numero")
    private Compte compte;
    
    public Transaction(Long idTransaction, String dateTransaction, double montant, String typeTransaction) {
        this.idTransaction = idTransaction;
        this.dateTransaction = dateTransaction;
        this.montant = montant;
        this.typeTransaction = typeTransaction;
    }

    public Transaction() {
        
    }

    
    
    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }
    
    
    
}
