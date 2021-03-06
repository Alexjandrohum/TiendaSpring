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
@Table(name = "tiendas")
public class Tienda implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTienda;
    private String nombreTienda;
    private int idDireccion;
    private int idUsuario;
    private String foto;
    private Date fechaCreado;
    private Date fechaEditado;
    private String estado;

}
