/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.dto;

import com.hm.serviceapp.model.Municipio;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author humartinez
 */
@XmlRootElement
public class MunicipioDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer idMunicipio;

    private String nombreMunicipio;

    private String descripcionMunicipio;

    private int idEstado;
    
    public MunicipioDTO(){
        
    }

    /**
     * @return the idMunicipio
     */
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    /**
     * @param idMunicipio the idMunicipio to set
     */
    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * @return the nombreMunicipio
     */
    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    /**
     * @param nombreMunicipio the nombreMunicipio to set
     */
    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    /**
     * @return the descripcionMunicipio
     */
    public String getDescripcionMunicipio() {
        return descripcionMunicipio;
    }

    /**
     * @param descripcionMunicipio the descripcionMunicipio to set
     */
    public void setDescripcionMunicipio(String descripcionMunicipio) {
        this.descripcionMunicipio = descripcionMunicipio;
    }

    /**
     * @return the estadoDTO
     */
    public int getIdEstadoDTO() {
        return idEstado;
    }

    /**
     * @param estadoDTO the estadoDTO to set
     */
    public void setIdEstadoDTO(int idEstado) {
        this.idEstado = idEstado;
    }
    
}
