/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.local.ClientDaoBeanLocal;
import entities.Client;
import javax.ejb.Stateless;

/**
 *
 * @author Nolhan
 */
public class ClientDaoBean extends GenericDAOBean<Client, Long> implements ClientDaoBeanLocal {

    public ClientDaoBean() {
        super(Client.class);
    }
}
