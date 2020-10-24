/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author alexjandrohum
 */
@Entity
@Table(name = "direcciones")
public class Direcciones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;
    private String calle;
    private int noInterior;
    private int noExterior;
    private int noCelular;
    private int idEstado;
    private Date fechaCreado;
    private Date fechaEditado;
    private String estado;

    public Direcciones() {
    }

    public Direcciones(Long idDireccion, String calle, int noInterior, int noExterior, int noCelular, int idEstado, Date fechaCreado, Date fechaEditado, String estado) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.noInterior = noInterior;
        this.noExterior = noExterior;
        this.noCelular = noCelular;
        this.idEstado = idEstado;
        this.fechaCreado = fechaCreado;
        this.fechaEditado = fechaEditado;
        this.estado = estado;
    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNoInterior() {
        return noInterior;
    }

    public void setNoInterior(int noInterior) {
        this.noInterior = noInterior;
    }

    public int getNoExterior() {
        return noExterior;
    }

    public void setNoExterior(int noExterior) {
        this.noExterior = noExterior;
    }

    public int getNoCelular() {
        return noCelular;
    }

    public void setNoCelular(int noCelular) {
        this.noCelular = noCelular;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public Date getFechaEditado() {
        return fechaEditado;
    }

    public void setFechaEditado(Date fechaEditado) {
        this.fechaEditado = fechaEditado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Direcciones{" + "idDireccion=" + idDireccion + ", calle=" + calle + ", noInterior=" + noInterior + ", noExterior=" + noExterior + ", noCelular=" + noCelular + ", idEstado=" + idEstado + ", fechaCreado=" + fechaCreado + ", fechaEditado=" + fechaEditado + ", estado=" + estado + '}';
    }

}
