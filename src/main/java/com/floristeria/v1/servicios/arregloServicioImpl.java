package com.floristeria.v1.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floristeria.v1.entidades.Arreglo;
import com.floristeria.v1.repositorios.arregloRepositorio;

@Service
public class arregloServicioImpl implements arregloServicio {

    @Autowired
    private arregloRepositorio repositorio;

    @Override
    public List<Arreglo> listarArreglos() {
        return repositorio.findAll();

    }

    @Override
    public Arreglo guardarArreglo(Arreglo arreglo) {
        return repositorio.save(arreglo);
    }

    @Override
    public Arreglo arregloById(Long id) {
        return repositorio.findById(id)
                .orElse(null);
    }

    @Override
    public Arreglo actualizarInfoArreglo(Arreglo arreglo) {
        return repositorio.save(arreglo);
    }

    @Override
    public void eliminarArreglo(Long id) {
        repositorio.deleteById(id);
    }

}
