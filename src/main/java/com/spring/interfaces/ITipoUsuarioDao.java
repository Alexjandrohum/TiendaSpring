/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.interfaces;

import com.spring.domain.TipoUsuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alexjandrohum
 */
public interface ITipoUsuarioDao extends CrudRepository<TipoUsuario, Integer>{
    
}
