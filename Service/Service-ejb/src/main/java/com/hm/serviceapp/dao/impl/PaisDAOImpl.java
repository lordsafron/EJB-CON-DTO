/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.dao.impl;

import com.hm.serviceapp.dao.PaisDAO;
import com.hm.serviceapp.model.Pais;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author humartinez
 */
@Stateless
public class PaisDAOImpl implements PaisDAO {

    @PersistenceContext(name = "serviceUnit")
    private EntityManager em;
    private List<Pais> lPais;
    private Pais pais;

    @Override
    public List<Pais> getAll() {
        try {
            Query consulta = em.createQuery("SELECT p FROM Pais p");
            lPais = consulta.getResultList();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return lPais;
    }

    @Override
    public Pais getById(int idPais) {
        try {
            Query consulta = em.createQuery("SELECT p FROM Pais p WHERE p.idPais = ?1");
            consulta.setParameter(1, idPais);
            pais = (Pais) consulta.getSingleResult();
            System.out.println("pais: " + pais.getNombrePais());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return pais;
    }

}
