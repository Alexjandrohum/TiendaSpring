/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import com.spring.domain.Producto;
import com.spring.servicio.ProductoService;
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
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/listarProductos")
    public String listarProductos(Model model){
        List<Producto> listaProductos = productoService.listarProductos();
        model.addAttribute("productos", listaProductos);
      
        return "listadoProductos";
    }
    
    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto productos){
        productos.setFechaCreado(new Date());
        productos.setFechaEditado(new Date());
        productos.setEstado("activo");
        productoService.agregarProducto(productos);
        return "redirect:/listarProductos";
    }
    
}
