/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.serviceapp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.hm.serviceapp.dto.EstadoDTO;
import com.hm.serviceapp.dto.MunicipioDTO;
import java.util.ArrayList;

/**
 *
 * @author humartinez
 */
@Entity
@Table(name = "estado")
@XmlRootElement
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado")
    private Integer idEstado;
    @Size(max = 50)
    @Column(name = "nombre_estado")
    private String nombreEstado;
    @Size(max = 100)
    @Column(name = "descripcion_estado")
    private String descripcionEstado;
    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais")
    @ManyToOne
    private Pais idPais;
    @OneToMany(mappedBy = "idEstado")
    private List<Municipio> municipioList;

    public Estado() {
    }

    public Estado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    @XmlTransient
    public List<Municipio> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<Municipio> municipioList) {
        this.municipioList = municipioList;
    }
    
    public EstadoDTO _toConverterEntity(Estado estado) {
        EstadoDTO estadoDTO = new EstadoDTO();
        List<MunicipioDTO> lMunicipioDTO = new ArrayList<>(); 
        estadoDTO.setIdEstado(idEstado);
        estadoDTO.setNombreEstado(nombreEstado);
        estadoDTO.setDescripcionEstado(descripcionEstado);
        estadoDTO.setIdPaisDTO(estado.getIdEstado());
        
        for (Municipio municipio : municipioList) {
            
               MunicipioDTO municipioDTO = municipio._toConverterEntity(municipio); 
            lMunicipioDTO.add(municipioDTO);
        }
        estadoDTO.setMunicipioList(lMunicipioDTO);
        return estadoDTO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hm.serviceapp.model.Estado[ idEstado=" + idEstado + " ]";
    }

}
