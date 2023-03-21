package com.sistema.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.modelo.pedido;

import java.util.List;


public interface PedidoRepository extends JpaRepository<pedido, Integer>{
    public List<pedido> findByNombre(String nombre);
}
