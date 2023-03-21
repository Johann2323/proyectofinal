package com.sistema.examenes.servicios.impl;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.examenes.modelo.pedido;
import com.sistema.examenes.repositorios.PedidoRepository;
import com.sistema.examenes.servicios.PedidoServiceImp;


@Service
public class PedidoService implements PedidoServiceImp{

	@Autowired
	private PedidoRepository pedidoR;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<pedido> finAll() {
		// TODO Auto-generated method stub
		return pedidoR.findAll();
	}

	@Override
	public Page<pedido> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return (Page<pedido>) pedidoR.findAll((Sort) pageable);
	}

	@Override
		public Optional<pedido> findById(Integer id) {
		// TODO Auto-generated method stub
		return pedidoR.findById(id);
	}

	@Override
	public pedido save(pedido pedido) {
		// TODO Auto-generated method stub
		return pedidoR.save(pedido);
	}

	@Override
	public void deleteById(Integer id) {
		pedidoR.deleteById(id);
		
	}

	@Override
	public pedido findById(int id) {
		// TODO Auto-generated method stub
		return pedidoR.findById(id).orElse(null);
	}

	@Override
	public List<pedido> findByNombre(String nombre) {
		return pedidoR.findByNombre(nombre);
	}


}
