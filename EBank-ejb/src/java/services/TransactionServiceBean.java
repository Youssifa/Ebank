/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.GenericDAOBeanLocal;
import dao.local.TransactionDaoBeanLocal;
import entities.Transaction;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.TransactionServiceBeanLocal;

/**
 *
 * @author DG
 */
@Stateless
public class TransactionServiceBean extends GenericServiceBean<Transaction, Long>
        implements TransactionServiceBeanLocal {

    @EJB
    private TransactionDaoBeanLocal dao;

    private final Logger logger;

    public TransactionServiceBean() {
        this.logger = Logger.getLogger(TransactionServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<Transaction, Long> getDAO() {
        return this.dao;
    }

}