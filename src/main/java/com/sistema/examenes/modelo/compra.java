package com.sistema.examenes.modelo;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
public class compra {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer id_pedido;

	private String nombre;

	private ArrayList <String> titulo;

	private ArrayList <Double> precion;
	private Date fecha_compra;
	private String estado;
	private Integer total;
	private String metodo_pago;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Date getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getMetodo_pago() {
		return metodo_pago;
	}
	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getTitulo() {
		return titulo;
	}

	public void setTitulo(ArrayList<String> titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Double> getPrecion() {
		return precion;
	}

	public void setPrecion(ArrayList<Double> precion) {
		this.precion = precion;
	}
}
