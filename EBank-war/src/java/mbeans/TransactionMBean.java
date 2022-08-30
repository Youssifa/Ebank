/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbeans;

import entities.Transaction;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import services.local.TransactionServiceBeanLocal;

/**
 *
 * @author DG
 */
@ViewScoped
@ManagedBean
public class TransactionMBean implements Serializable{
    @EJB
    private TransactionServiceBeanLocal beanLocal;
    
    private Transaction transaction = new Transaction();
}
