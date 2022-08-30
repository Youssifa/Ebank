/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbeans;

import entities.Agence;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import services.AgenceServiceBean;
import services.local.AgenceServiceBeanLocal;

/**
 *
 * @author DG
 */
@ViewScoped
@ManagedBean
public class AgenceMBean implements Serializable{
    @EJB
    private AgenceServiceBean beanLocal;
    
    private Agence agence = new Agence();
}
