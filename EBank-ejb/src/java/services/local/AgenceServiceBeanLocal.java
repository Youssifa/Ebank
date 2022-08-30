/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.local;

import entities.Agence;
import javax.ejb.Local;
import services.GenericServiceBeanLocal;
import services.GenericServiceBeanLocal;


@Local
public interface AgenceServiceBeanLocal extends GenericServiceBeanLocal<Agence, Long> {

}
