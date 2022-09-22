package com.app.clearVisionLens.model;

public class Producto {
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	private String graduacion;
	private String uso;
	
	// Constructor vacio
	public Producto() {
	}

	
	// Constructor con parametros
	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad,
			String graduacion, String uso) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
		this.graduacion = graduacion;
		this.uso = uso;
	}

	
	//Getter y Setter

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getGraduacion() {
		return graduacion;
	}


	public void setGraduacion(String graduacion) {
		this.graduacion = graduacion;
	}


	public String getUso() {
		return uso;
	}


	public void setUso(String uso) {
		this.uso = uso;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + ", graduacion=" + graduacion + ", uso=" + uso + "]";
	}
	
	
	
	
	
	
	
	
	
}
