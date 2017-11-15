/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.clientapp.controller;

import com.hm.clientapp.util.Utilidades;
import com.hm.serviceapp.dto.PaisDTO;
import com.hm.serviceapp.service.PaisService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author humartinez
 */
public class PaisController {
    
    private PaisService paisService;
    private List<PaisDTO> lPaisDTO;
    private PaisDTO paisDTO;
    
    public List<PaisDTO> getAll() throws Exception {
        
        paisService = (PaisService) Utilidades.getEJBRemote("Pais", PaisService.class.getName());
        
        lPaisDTO = paisService.getAll();
        
        return lPaisDTO;
    }
    
    public PaisDTO getById(int idPais) throws Exception {
        paisService = (PaisService) Utilidades.getEJBRemote("Pais", PaisService.class.getName());
        paisDTO = paisService.getById(idPais);
        System.out.println("enCliente: " + paisDTO.getNombrePais());
        return paisDTO;
    }
    
}
