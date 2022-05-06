package com.idat.AbrilServicioI.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AbrilServicioI.modelo.Productos;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, Integer> {
	
	
	/*public void guardarProducto(Productos producto);
	
	public void editarProducto(Productos producto);
	
	public void eliminarProducto(Integer id);
	
	public List<Productos> listarProducto();
	
	public Productos obtenerrProducto(Integer id);*/
	
	

}
