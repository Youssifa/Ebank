/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.CompteDaoBeanLocal;
import entities.Compte;

/**
 *
 * @author DG
 */
public class CompteDAOBean extends GenericDAOBean<Compte, Long> implements CompteDaoBeanLocal {

    public CompteDAOBean() {
        super(Compte.class);
    }
}