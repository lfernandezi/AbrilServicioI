package com.idat.AbrilServicioI.servicio;

import java.util.List;
import java.util.Optional;

import com.idat.AbrilServicioI.dto.ProductoDTORequest;
import com.idat.AbrilServicioI.dto.ProductoDTOResponse;
import com.idat.AbrilServicioI.modelo.Productos;

public interface ProductoServicio {

	public void guardarProducto(ProductoDTORequest producto);
	
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProducto();
	
	public ProductoDTOResponse obtenerrProducto(Integer id);
}
