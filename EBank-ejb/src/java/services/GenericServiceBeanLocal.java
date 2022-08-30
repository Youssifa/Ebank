/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @param <E> represente entité
 * @param <ID> Type de l'identifiant
 */
public interface GenericServiceBeanLocal<E extends Serializable, ID> {

    void addOne(E e);

    E addOneWithFlush(E e);

    E updateOne(E e);

    void deleteOne(E e);

    void deleteOne(ID id);

    void deleteAll();

    E getOne(ID id);

    List<E> getAll();

    Long count();

    boolean exists(ID id);

}
