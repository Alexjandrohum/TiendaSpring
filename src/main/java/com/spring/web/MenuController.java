/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alexjandrohum
 */
@Controller
public class MenuController {
    
    @GetMapping("/menuTienda")
    public String menuTienda(){
        return "menuProductos";
    }
    
}
