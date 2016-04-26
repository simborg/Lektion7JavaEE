/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nackademin.lektion7manytomanydb.businesslogic;

import com.nackademin.lektion7manytomanydb.entities.Bird;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author borgs_000
 */
@Stateless
public class BirdFacade extends AbstractFacade<Bird> {

    @PersistenceContext(unitName = "persistanceUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BirdFacade() {
        super(Bird.class);
    }
    
}
