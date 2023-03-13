package com.sistema.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.examenes.modelo.compra;



@Repository
public interface CompraRepository extends JpaRepository<compra, Integer>{

}
