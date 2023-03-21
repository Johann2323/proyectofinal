package com.sistema.examenes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.examenes.modelo.compra;
import com.sistema.examenes.modelo.pedido;



@Repository
public interface CompraRepository extends JpaRepository<compra, Integer>{
    public List<compra> findByNombre(String nombre);
}
