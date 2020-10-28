/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.servicio;

import com.spring.domain.Producto;
import java.util.List;

/**
 *
 * @author alexjandrohum
 */
public interface ProductoService {

    List<Producto> listarProductos();

    void agregarProducto(Producto producto);

    void eliminarProducto(Producto producto);

    Producto buscarProducto(Producto producto);

}
