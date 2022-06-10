package com.idat.AbrilServicioI.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Productos")
public class Productos implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -850238268495904458L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	
	//@Column(name="otro nombre") --- Para nombrar en base de datos
	private String nombreproducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	@OneToOne(mappedBy="productoinstancia")
	private Proveedor proveedor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name= "producto_cliente",
	joinColumns =
	@JoinColumn(name="id_cliente", 
				nullable =false,
				unique = true,
				foreignKey =@ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clientes (id_cliente)")),
	inverseJoinColumns =
	@JoinColumn(name="idproducto",
				nullable =false,
				unique = true,
				foreignKey =@ForeignKey(foreignKeyDefinition = "foreign key (idproducto) references productos (idproducto)")))
	
	
	private List<Cliente> cliente = new ArrayList<Cliente>();
	
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
