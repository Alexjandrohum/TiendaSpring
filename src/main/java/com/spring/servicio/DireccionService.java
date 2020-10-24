/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.servicio;

import com.spring.domain.Direcciones;
import java.util.List;

/**
 *
 * @author alexjandrohum
 */
public interface DireccionService {
    
    List<Direcciones> listarDirecciones();
    
    void guardarDireccion(Direcciones direccion);
    
    void eliminarDireccion(Direcciones direccion);
    
    Direcciones buscarDireccion(Direcciones direccion);
    
    
}
