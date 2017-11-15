/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.dao;

import com.hm.serviceapp.model.Pais;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author humartinez
 */
@Local
public interface PaisDAO {
    
    public List<Pais> getAll();
    
    public Pais getById(int idPais);
    
}
