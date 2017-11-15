/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.clientapp.resource;

import com.hm.clientapp.controller.PaisController;
import com.hm.serviceapp.dto.PaisDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author humartinez
 */
@Path("pais")
public class PaisResource {
    
    public PaisResource(){
        
    }
    
    private PaisController paisController= new PaisController();
    
    @GET
    @Path("getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PaisDTO> getAll() throws Exception {
        
        List<PaisDTO> lPaisDTO = new ArrayList<>();
        lPaisDTO = paisController.getAll();

        return lPaisDTO;
        
    }
    @GET
    @Path("getById/{idPais}")
    @Produces(MediaType.APPLICATION_JSON)
    public PaisDTO getById(@PathParam("idPais") int idPais) throws Exception {
        PaisDTO paisDTO = new PaisDTO();
        System.out.println("Inicio metodo ");
        paisDTO = paisController.getById(idPais);
        return paisDTO;
        
    }
    
}
