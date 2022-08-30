/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compte_courant;

import entities.CompteCourant;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DG
 */
@Stateless
public class CompteCourantFacade extends AbstractFacade<CompteCourant> {

    @PersistenceContext(unitName = "EBank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteCourantFacade() {
        super(CompteCourant.class);
    }
    
}
