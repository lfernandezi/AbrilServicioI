package com.idat.AbrilServicioI.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.AbrilServicioI.modelo.Productos;

@Repository
public class ProductoRepositorioImpl implements ProductoRepositorio {

	public List<Productos> listar= new ArrayList<Productos>();
	
	
	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.add(producto);
	}

	@Override
	public void editarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.remove(obtenerrProducto(producto.getIdproducto()));
		listar.add(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerrProducto(id));
	}

	@Override
	public List<Productos> listarProducto() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Productos obtenerrProducto(Integer id) {
		// TODO Auto-generated method stub
		
		/*if (id != null) {
			for (Productos producto:listar) {
			
				if(producto.getIdproducto()== id) {
					return producto;
				}else {
					return null;
				}
			}
		
		}else {
			return null;
		}*/
		
		
		return listar.stream().filter(prod ->prod.getIdproducto()== id).findFirst().orElse(null);
	}
}
