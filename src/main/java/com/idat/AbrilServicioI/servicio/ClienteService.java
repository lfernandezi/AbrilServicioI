package com.idat.AbrilServicioI.servicio;

import java.util.List;

import com.idat.AbrilServicioI.dto.ClienteDTORequest;
import com.idat.AbrilServicioI.dto.ClienteDTOResponse;


public interface ClienteService {
	

public void guardarCliente(ClienteDTORequest cliente);
	
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarCliente();
	
	public ClienteDTOResponse obtenerCliente(Integer id);

}
