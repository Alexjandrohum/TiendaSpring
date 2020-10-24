/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import com.spring.domain.Direcciones;
import com.spring.domain.Estado;
import com.spring.domain.Localidad;
import com.spring.domain.Municipio;
import com.spring.domain.TipoUsuario;
import com.spring.interfaces.IEstadoDao;
import com.spring.interfaces.ILocalidadDao;
import com.spring.interfaces.IMunicipioDao;
import com.spring.interfaces.ITipoUsuarioDao;
import com.spring.servicio.DireccionService;
import java.util.Date;
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
public class DireccionController {

    @Autowired
    private IEstadoDao estadoDao;
    @Autowired
    private IMunicipioDao municipioDao;
    @Autowired
    private ILocalidadDao localidadDao;
    @Autowired
    private ITipoUsuarioDao tipoUsuarioDao;
    @Autowired
    private DireccionService direccionService;

    @GetMapping("/direccion")
    public String registrarDireccion(Model model) {

        List<Estado> estados = (List<Estado>) estadoDao.findAll();
        List<Municipio> municipios = (List<Municipio>) municipioDao.findAll();
        List<Localidad> localidades = (List<Localidad>) localidadDao.findAll();
        List<TipoUsuario> tipoUsuarios = (List<TipoUsuario>) tipoUsuarioDao.findAll();

        model.addAttribute("estados", estados);
        model.addAttribute("municipios", municipios);
        model.addAttribute("localidades", localidades);
        return "direccion";
    }

    @GetMapping("/agregarDireccion")
    public String irRegistrodireccion(Direcciones direcciones) {
        return "direccion";
    }

    @GetMapping("/mostrarDirecciones")
    public String mostrarDirecciones(Model model) {
        List<Direcciones> direcciones = (List<Direcciones>) direccionService.listarDirecciones();
        model.addAttribute("direcciones", direcciones);
        return ("listadoDirecciones");
    }

    @PostMapping("/guardarDireccion")
    public String guardarDireccion(Direcciones direcciones) {

        direcciones.setIdEstado(1);
        direcciones.setFechaCreado(new Date());
        direcciones.setFechaEditado(new Date());
        direcciones.setEstado("Activo");
        direccionService.guardarDireccion(direcciones);
        log.info("Direcciones: " + direcciones);
        return "redirect:/mostrarDirecciones";
    }

    @GetMapping("/editarDireccion/{idDireccion}")
    public String editarDireccion(Direcciones direcciones, Model model) {
        direcciones = direccionService.buscarDireccion(direcciones);
        model.addAttribute("direcciones", direcciones);
        List<Estado> estados = (List<Estado>) estadoDao.findAll();
        List<Municipio> municipios = (List<Municipio>) municipioDao.findAll();
        List<Localidad> localidades = (List<Localidad>) localidadDao.findAll();
        List<TipoUsuario> tipoUsuarios = (List<TipoUsuario>) tipoUsuarioDao.findAll();

        model.addAttribute("estados", estados);
        model.addAttribute("municipios", municipios);
        model.addAttribute("localidades", localidades);
        return "direccion";
    }

    @GetMapping("/eliminarDireccion")
    public String eliminarDireccion(Direcciones direcciones) {
        direccionService.eliminarDireccion(direcciones);
        return "redirect:/mostrarDirecciones";
    }
    
    @GetMapping("/mostrarEstados")
    public String mostrarEstados(Model model){
        List<Estado> estados = (List<Estado>) estadoDao.findAll();
        List<Municipio> municipios = (List<Municipio>) municipioDao.findAll();
        List<Localidad> localidades = (List<Localidad>) localidadDao.findAll();

        model.addAttribute("estados", estados);
        model.addAttribute("municipios", municipios);
        model.addAttribute("localidades", localidades);
        log.info("Estados: "+estados);
        log.info("Municipios: "+municipios);
        log.info("Localidades: "+localidades);
        return "agregarDireccion";
    }
}
