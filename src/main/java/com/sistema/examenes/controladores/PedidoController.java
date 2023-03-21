package com.sistema.examenes.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.examenes.modelo.pedido;
import com.sistema.examenes.repositorios.PedidoRepository;
import com.sistema.examenes.servicios.impl.PedidoService;



@RestController
@RequestMapping("/api/pedido")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/getpedido")
	List<pedido> getAll(){
		return pedidoRepository.findAll();
	}
	
	@PostMapping("/crearpedido")
	@ResponseStatus(HttpStatus.CREATED)
	pedido create(@RequestBody pedido pedidos) {
		pedidoRepository.save(pedidos);
		 return pedidos;
	}
	
	@PutMapping("/editarpedido/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public pedido editar(@RequestBody pedido pedidos, @PathVariable int id) {
		pedido pedidoactual = pedidoService.findById(id);
		pedidoactual.setFecha_pedido(pedidos.getFecha_pedido());
		pedidoactual.setEstado(pedidos.getEstado());
		pedidoactual.setTotal(pedidos.getTotal());
		pedidoactual.setId_usuario(pedidos.getId_usuario());
		return pedidoService.save(pedidoactual);
	}
	
	@GetMapping ("/buscarpedido/{id}")
	public pedido show(@PathVariable int id) {
		return pedidoService.findById(id);
	}
	
	@DeleteMapping("/eliminarpedido/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id) {
		pedidoService.deleteById(id);
	}

	@GetMapping("buscarxnombre/{nombre}")
	public List <pedido> show(@PathVariable String nombre){return pedidoService.findByNombre(nombre);}
	
}
