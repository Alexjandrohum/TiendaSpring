/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.implementacion;

import com.spring.domain.Direcciones;
import com.spring.interfaces.IDireccionesDao;
import com.spring.servicio.DireccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexjandrohum
 */
@Service
public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private IDireccionesDao direccionesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Direcciones> listarDirecciones() {

        return (List<Direcciones>) direccionesDao.findAll();
    }

    @Override
    @Transactional
    public void guardarDireccion(Direcciones direccion) {
        direccionesDao.save(direccion);
    }

    @Override
    @Transactional
    public void eliminarDireccion(Direcciones direccion) {
        direccionesDao.delete(direccion);
    }

    @Override
    @Transactional(readOnly = true)
    public Direcciones buscarDireccion(Direcciones direccion) {

        return direccionesDao.findById(direccion.getIdDireccion()).orElse(null);
    }

}
