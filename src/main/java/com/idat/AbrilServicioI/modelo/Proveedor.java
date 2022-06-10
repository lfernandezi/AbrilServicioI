package com.idat.AbrilServicioI.modelo;


import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Proveedores")
@Entity
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProveedor;

	private String proveedor;
	
	private String direccion;

	@OneToOne
	@JoinColumn(name="idproducto", 
				nullable=false,
				unique=true, 
				foreignKey =@ForeignKey(foreignKeyDefinition= "foreign key(idproducto) references productos (idproducto)"))
	private Productos productoinstancia;
	
	public Integer getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
