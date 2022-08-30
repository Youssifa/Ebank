/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.local;

import entities.Client;
import javax.ejb.Local;
import services.GenericServiceBeanLocal;

/**
 *
 * @author DG
 */
@Local
public interface ClientServiceBeanLocal extends GenericServiceBeanLocal<Client, Long> {

}
