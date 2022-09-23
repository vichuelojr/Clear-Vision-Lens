package com.app.clearVisionLens.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCreaccion;
	private Date fechaRecibida;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "pedido")
	private DetallePedido detalle;
	
	
	// Constructor vacio
	public Pedido() {
		
	}
	
	// Constructor con parametros
	public Pedido(Integer id, String numero, Date fechaCreaccion, Date fechaRecibida, double total) {
		this.id = id;
		this.numero = numero;
		this.fechaCreaccion = fechaCreaccion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	// Getter y Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreaccion() {
		return fechaCreaccion;
	}

	public void setFechaCreaccion(Date fechaCreaccion) {
		this.fechaCreaccion = fechaCreaccion;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DetallePedido getDetalle() {
		return detalle;
	}

	public void setDetalle(DetallePedido detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numero=" + numero + ", fechaCreaccion=" + fechaCreaccion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
	
	
}
