/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.servicio;

import com.spring.domain.TipoUsuario;
import com.spring.domain.Usuario;
import java.util.List;

/**
 *
 * @author alexjandrohum
 */
public interface UsuarioService {
    
    public List<Usuario> listaUsuarios();
    
    void guardarUsuario(Usuario usuario);
    
    void eliminarUsuario(Usuario usuario);
    
    Usuario buscarUsuario(Usuario usuario);
    
    List<TipoUsuario> listaTiposUsuarios();
    
}
