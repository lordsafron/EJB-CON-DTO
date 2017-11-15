/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.service;

import com.hm.serviceapp.dto.PaisDTO;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author humartinez
 */
@Remote
public interface PaisService {
    
    public List<PaisDTO> getAll();
    
    public PaisDTO getById(int idPais);
    
}
