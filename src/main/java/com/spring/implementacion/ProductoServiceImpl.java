
package com.spring.implementacion;

import com.spring.domain.Producto;
import com.spring.interfaces.IProductoDao;
import com.spring.servicio.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexjandrohum
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public void agregarProducto(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void eliminarProducto(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto buscarProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

}
