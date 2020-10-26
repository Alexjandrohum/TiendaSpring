/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.implementacion;

import com.spring.domain.TipoUsuario;
import com.spring.domain.Usuario;
import com.spring.interfaces.ITipoUsuarioDao;
import com.spring.interfaces.IUsuarioDao;
import com.spring.servicio.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexjandrohum
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;
    
    @Autowired
    private ITipoUsuarioDao tipoUsuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional
    public void guardarUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario buscarUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    public List<TipoUsuario> listaTiposUsuarios() {
        return (List<TipoUsuario>) tipoUsuarioDao.findAll();
    }

}
