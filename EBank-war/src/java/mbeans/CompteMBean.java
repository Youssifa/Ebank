/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbeans;

import entities.Compte;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import services.local.CompteServiceBeanLocal;

/**
 *
 * @author DG
 */
@ViewScoped
@ManagedBean
public class CompteMBean implements Serializable{
    @EJB
    private CompteServiceBeanLocal beanLocal;
    
    private Compte compte = new Compte() {};
}
