/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import com.spring.domain.TipoUsuario;
import com.spring.domain.Usuario;
import com.spring.interfaces.ITipoUsuarioDao;
import com.spring.interfaces.IUsuarioDao;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author alexjandrohum
 */
@Controller
@Slf4j
public class UsuarioController {

    @Autowired
    private IUsuarioDao usuarioDao;
    @Autowired
    private ITipoUsuarioDao tipoUsuarioDao;

    @GetMapping("/registroUsuario")
    public String registroUsuario(Model model) {
        return "registroUsuario";
    }

    @GetMapping("/registroTienda")
    public String registroTienda(Model model) {
        return "registroTienda";
    }

    @GetMapping("/listadoUsuarios")
    public String listadoUsuarios(Model model) {

        List<Usuario> usuarios = (List<Usuario>) usuarioDao.findAll();
        List<TipoUsuario> tipoUsuarios = (List<TipoUsuario>) tipoUsuarioDao.findAll();

        model.addAttribute("usuarios", usuarios);
        model.addAttribute("tipos", tipoUsuarios);
        return "listadoUsuarios";
    }

}
