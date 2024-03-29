package com.sistema.examenes.servicios;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.sistema.examenes.modelo.compra;
import com.sistema.examenes.modelo.pedido;



public interface CompraServiceImp {

	public Iterable<compra> finAll();
	public Page<compra> findAll(Pageable pageable);
	public Optional<compra> findById(Integer id);
	public compra save(compra compra);
	public void deleteById(Integer id);
	public compra findById(int id);
	public List<compra> findByNombre(String nombre);
}
