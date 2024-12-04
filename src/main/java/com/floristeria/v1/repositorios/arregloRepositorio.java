package com.floristeria.v1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floristeria.v1.entidades.Arreglo;

@Repository
public interface arregloRepositorio extends JpaRepository<Arreglo, Long> {

}
