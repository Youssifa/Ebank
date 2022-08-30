/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbeans;

import entities.Client;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import services.local.ClientServiceBeanLocal;

/**
 *
 * @author DG
 */
@ViewScoped
@ManagedBean
public class ClientMBean implements Serializable{
    @EJB
    private ClientServiceBeanLocal beanLocal;
    
    private Client client = new Client();
}
