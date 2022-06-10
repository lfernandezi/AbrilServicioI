package com.idat.AbrilServicioI.servicio;

import java.util.List;

import com.idat.AbrilServicioI.dto.ItemDTORequest;
import com.idat.AbrilServicioI.dto.ItemDTOResponse;



public interface ItemService {
	
public void guardarProducto(ItemDTORequest item);
	
	public void editarItem(ItemDTORequest item);
	
	public void eliminarItem(Integer id);
	
	public List<ItemDTOResponse> listarItem();
	
	public ItemDTOResponse obtenerItem(Integer id);

}
