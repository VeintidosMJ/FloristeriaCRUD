package com.floristeria.v1.servicios;

import java.util.List;

import com.floristeria.v1.entidades.Arreglo;

public interface arregloServicio {

    public List<Arreglo> listarArreglos();

    public Arreglo guardarArreglo(Arreglo arreglo);

    public Arreglo arregloById(Long id);

    public Arreglo actualizarInfoArreglo(Arreglo arreglo);

    public void eliminarArreglo(Long id);
}
