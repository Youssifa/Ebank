/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.local;

import entities.Compte;
import javax.ejb.Local;
import services.GenericServiceBeanLocal;

/**
 *
 * @author DG
 */
@Local
public interface CompteServiceBeanLocal extends GenericServiceBeanLocal<Compte, Long> {

}
