/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.GenericDAOBeanLocal;
import dao.local.ClientDaoBeanLocal;
import entities.Client;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.ClientServiceBeanLocal;

/**
 *
 * @author DG
 */
@Stateless
public class ClientServiceBean extends GenericServiceBean<Client, Long>
        implements ClientServiceBeanLocal {

    @EJB
    private ClientDaoBeanLocal dao;

    private final Logger logger;

    public ClientServiceBean() {
        this.logger = Logger.getLogger(ClientServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<Client, Long> getDAO() {
        return this.dao;
    }

}
