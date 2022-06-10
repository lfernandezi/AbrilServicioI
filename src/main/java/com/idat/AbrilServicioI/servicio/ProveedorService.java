package com.idat.AbrilServicioI.servicio;

import java.util.List;

import com.idat.AbrilServicioI.dto.ProveedorDTORequest;
import com.idat.AbrilServicioI.dto.ProveedorDTOResponse;


public interface ProveedorService {

public void guardarProveedor(ProveedorDTORequest proveedor);
	
	public void editarProveedor(ProveedorDTORequest proveedor);
	
	public void eliminarProveedor(Integer id);
	
	public List<ProveedorDTOResponse> listarProveedor();
	
	public ProveedorDTOResponse obtenerProveedor(Integer id);
}
