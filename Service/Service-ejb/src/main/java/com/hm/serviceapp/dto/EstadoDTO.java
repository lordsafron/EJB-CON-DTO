/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.dto;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author humartinez
 */
@XmlRootElement
public class EstadoDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer idEstado;

    private String nombreEstado;

    private String descripcionEstado;

    private int idPais;

    private List<MunicipioDTO> municipioList;

    public EstadoDTO() {
    }

    /**
     * @return the idEstado
     */
    public Integer getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the nombreEstado
     */
    public String getNombreEstado() {
        return nombreEstado;
    }

    /**
     * @param nombreEstado the nombreEstado to set
     */
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    /**
     * @return the descripcionEstado
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * @param descripcionEstado the descripcionEstado to set
     */
    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    /**
     * @return the paisDTO
     */
    public int getIdPaisDTO() {
        return idPais;
    }

    /**
     */
    public void setIdPaisDTO(int idPais) {
        this.idPais = idPais;
    }

    /**
     * @return the municipioList
     */
    @XmlTransient
    public List<MunicipioDTO> getMunicipioList() {
        return municipioList;
    }

    /**
     * @param municipioList the municipioList to set
     */
    public void setMunicipioList(List<MunicipioDTO> municipioList) {
        this.municipioList = municipioList;
    }
    
    
}
