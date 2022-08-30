/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.GenericDAOBeanLocal;
import dao.local.CompteDaoBeanLocal;
import entities.Compte;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.CompteServiceBeanLocal;

/**
 *
 * @author DG
 */
@Stateless
public class CompteServiceBean extends GenericServiceBean<Compte, Long>
        implements CompteServiceBeanLocal {

    @EJB
    private CompteDaoBeanLocal dao;

    private final Logger logger;

    public CompteServiceBean() {
        this.logger = Logger.getLogger(CompteServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<Compte, Long> getDAO() {
        return this.dao;
    }
    

}