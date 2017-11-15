/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.dto;

import com.hm.serviceapp.model.Estado;
import com.hm.serviceapp.model.Pais;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author humartinez
 */
@XmlRootElement
public class PaisDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Integer idPais;

    private String nombrePais;

    private String descripcionPais;

    @Transient
    private List<EstadoDTO> estadoList;

    public PaisDTO() {
    }

    public PaisDTO(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getDescripcionPais() {
        return descripcionPais;
    }

    public void setDescripcionPais(String descripcionPais) {
        this.descripcionPais = descripcionPais;
    }
    
    @XmlTransient
    public List<EstadoDTO> getEstadoList() {
        return estadoList;
    }

    public void setEstadoList(List<EstadoDTO> estadoList) {
        this.estadoList = estadoList;
    }
    
    
}
