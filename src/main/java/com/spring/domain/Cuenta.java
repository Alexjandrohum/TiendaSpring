/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author alexjandrohum
 */
@Data
@Entity
@Table(name = "cuentas")
public class Cuenta implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuenta;
    private int cantidadLimite;
    private int cantidadTotal;
    private int idUsuario;
    private Date fechaCreado;
    private Date fechaEditado;
    private String estado;

}
