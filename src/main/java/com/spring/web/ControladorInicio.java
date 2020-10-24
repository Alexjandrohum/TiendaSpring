/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import com.spring.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alexjandrohum
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.propiedades}")
    private String saludoProperties;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        String mensaje = "Hola compartiendo información con Model";

        Persona persona = new Persona();
        persona.setNombre("Alexjandrohum");
        persona.setApellido("HErmen");
        persona.setEmail("alexjandrohum@gmail.com");
        persona.setTelefono("24643545");

        Persona persona2 = new Persona();
        persona2.setNombre("Cinthya");
        persona2.setApellido("Castro");
        persona2.setEmail("cinthya@gmail.com");
        persona2.setTelefono("2459327535");

        //Primera forma de agregar el dominio a una lista
        List<Persona> personas = new ArrayList<>();
        //personas.add(persona);
        //personas.add(persona2);

        //Segunda forma de agrehar el dominio a una lista sin inicializarla
        List<Persona> personas2 = Arrays.asList(persona, persona2);

        log.info("ejecutando el controlador rest");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludoProperties);
        model.addAttribute("persona", persona);
        model.addAttribute("listaPersonas1", personas);
        model.addAttribute("listaPersonas2", personas2);
        return "index";
    }

}
