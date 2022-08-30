package entities;

import entities.Agence;
import entities.Client;
import entities.Transaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-30T20:02:03")
@StaticMetamodel(Compte.class)
public abstract class Compte_ { 

    public static volatile SingularAttribute<Compte, Agence> agence;
    public static volatile SingularAttribute<Compte, String> dateCreation;
    public static volatile SingularAttribute<Compte, Long> numero;
    public static volatile SingularAttribute<Compte, Double> solde;
    public static volatile SingularAttribute<Compte, Client> client;
    public static volatile ListAttribute<Compte, Transaction> transactions;

}