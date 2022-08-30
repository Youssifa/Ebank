package entities;

import entities.Compte;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-30T20:02:03")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, String> typeTransaction;
    public static volatile SingularAttribute<Transaction, Double> montant;
    public static volatile SingularAttribute<Transaction, String> dateTransaction;
    public static volatile SingularAttribute<Transaction, Long> idTransaction;
    public static volatile SingularAttribute<Transaction, Compte> compte;

}