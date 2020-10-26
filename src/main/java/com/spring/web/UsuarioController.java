/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import com.spring.domain.TipoUsuario;
import com.spring.domain.Usuario;
import com.spring.servicio.UsuarioService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alexjandrohum
 */
@Controller
@Slf4j
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioDao;

    @GetMapping("/registroUsuario")
    public String registroUsuario(Model model) {
        List<TipoUsuario> tiposUsuarios = usuarioDao.listaTiposUsuarios();
        model.addAttribute("tipos", tiposUsuarios);
        return "registroUsuario";
    }

    @GetMapping("/listadoUsuarios")
    public String listadoUsuarios(Model model) {

        List<Usuario> usuarios = usuarioDao.listaUsuarios();
        List<TipoUsuario> tipoUsuarios = (List<TipoUsuario>) usuarioDao.listaTiposUsuarios();

        model.addAttribute("usuarios", usuarios);
        model.addAttribute("tipos", tipoUsuarios);
        return "listadoUsuarios";
    }

}
