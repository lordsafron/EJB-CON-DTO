/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.service.impl;

import com.hm.serviceapp.dao.PaisDAO;
import com.hm.serviceapp.dto.PaisDTO;
import com.hm.serviceapp.model.Pais;
import com.hm.serviceapp.service.PaisService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author humartinez
 */
@Stateless(mappedName = "Pais")
public class PaisServiceImpl implements PaisService {

    @EJB
    private PaisDAO paisDAO;
    private PaisDTO paisDTO;
    private Pais pais;
    private List<Pais> lPais;

    @Override
    public List<PaisDTO> getAll() {
        List<PaisDTO> lPaisDTO = new ArrayList<>();
        lPais = paisDAO.getAll();
        for (Pais paisEntity : lPais) {
            paisDTO = paisEntity._toConvertPaisEntity(paisEntity);
            lPaisDTO.add(paisDTO);
        }

        return lPaisDTO;
    }

    @Override
    public PaisDTO getById(int idPais) {
        
        pais = paisDAO.getById(idPais);
        paisDTO = pais._toConvertPaisEntity(pais);
        if (paisDTO != null) {
            System.out.println("Tiene contenido");
        } else {
           System.out.println("Esta vacio"); 
        }
        return paisDTO;
    }

}
