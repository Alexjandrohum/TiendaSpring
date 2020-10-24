/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import com.spring.domain.Direcciones;
import com.spring.interfaces.IDireccionesDao;
import com.spring.servicio.DireccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alexjandrohum
 */
@Controller
public class ControladorMenu {

    @Autowired
    private DireccionService direccionService;

    @GetMapping("/menu")
    public String menuProductos(Model model) {

        List<Direcciones> direcciones = (List<Direcciones>) direccionService.listarDirecciones();

        model.addAttribute("direcciones", direcciones);
        return ("menuProductos");
    }
}
