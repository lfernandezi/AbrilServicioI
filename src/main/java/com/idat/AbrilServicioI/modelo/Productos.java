package com.idat.AbrilServicioI.modelo;

import java.io.Serializable;

public class Productos implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -850238268495904458L;
	
	private Integer idproducto;
	private String nombreproducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	public Productos () {}
	
	public Productos(Integer idproducto, String nombreproducto, String descripcion, Double precio, Integer stock) {
		super();
		this.idproducto = idproducto;
		this.nombreproducto = nombreproducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Integer getIdproducto() {
		return idproducto;
	}
	
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	
	public String getNombreproducto() {
		return nombreproducto;
	}
	
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}
