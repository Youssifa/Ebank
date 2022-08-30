/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.TransactionDaoBeanLocal;
import entities.Transaction;

/**
 *
 * @author DG
 */
public class TransactionDAOBean extends GenericDAOBean<Transaction, Long> implements TransactionDaoBeanLocal {

    public TransactionDAOBean() {
        super(Transaction.class);
    }
}
