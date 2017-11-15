/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.model;

import com.hm.serviceapp.dto.EstadoDTO;
import com.hm.serviceapp.dto.PaisDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author humartinez
 */
@Entity
@Table(name = "pais")
@XmlRootElement
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pais")
    private Integer idPais;
    @Size(max = 50)
    @Column(name = "nombre_pais")
    private String nombrePais;
    @Size(max = 100)
    @Column(name = "descripcion_pais")
    private String descripcionPais;
    @OneToMany(mappedBy = "idPais")
    private List<Estado> estadoList;

    public Pais() {
    }

    public Pais(Integer idPais) {
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
    public List<Estado> getEstadoList() {
        return estadoList;
    }

    public void setEstadoList(List<Estado> estadoList) {
        this.estadoList = estadoList;
    }

    
    public PaisDTO _toConvertPaisEntity(Pais paisEntity) {
        
        PaisDTO dto = new PaisDTO();
        List<EstadoDTO> lEstadoDTO = new ArrayList<>();
        dto.setIdPais(idPais);
        dto.setNombrePais(nombrePais);
        dto.setDescripcionPais(descripcionPais);
        
        for (Estado estado : estadoList) {
            EstadoDTO estadoDTO = estado._toConverterEntity(estado);
            lEstadoDTO.add(estadoDTO);
        }
        dto.setEstadoList(lEstadoDTO);
        return dto;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hm.serviceapp.model.Pais[ idPais=" + idPais + " ]";
    }
    
}
