package com.idat.AbrilServicioI.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicioI.dto.ProductoDTORequest;
import com.idat.AbrilServicioI.dto.ProductoDTOResponse;
import com.idat.AbrilServicioI.modelo.Productos;
import com.idat.AbrilServicioI.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {
	
	@Autowired
	public ProductoRepositorio repositorio;

	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		
		Productos p=new Productos();
		p.setNombreproducto(producto.getDescripcionDTO());
		p.setDescripcion(producto.getDescripcionDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		// TODO Auto-generated method stub
		repositorio.save(p);

	}

	@Override
	public void editarProducto(ProductoDTORequest producto) {
		
		Productos p=new Productos();
		p.setNombreproducto(producto.getDescripcionDTO());
		p.setDescripcion(producto.getDescripcionDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(p);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProducto() {
		
		List<ProductoDTOResponse> lista= new ArrayList<ProductoDTOResponse>();
		
		for (Productos p:repositorio.findAll() ) {
			ProductoDTOResponse prod= new ProductoDTOResponse();
			prod.setIdproductoDTO(p.getIdproducto());
			prod.setNombreproductoDTO(p.getDescripcion());
			prod.setDescripcionDTO(p.getDescripcion());
			prod.setPrecioDTO(p.getPrecio());
			prod.setStockDTO(p.getStock());
			
			lista.add(prod);
			
		}
		
		// TODO Auto-generated method stub
		
		return lista;
	}

	/*@Override
	public Optional<Productos> obtenerrProducto(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}*/
	
	@Override
	public ProductoDTOResponse obtenerrProducto(Integer id) {
		
		Productos p = repositorio.findById(id).orElse(null);
		
		ProductoDTOResponse prod= new ProductoDTOResponse();
		prod.setIdproductoDTO(p.getIdproducto());
		prod.setNombreproductoDTO(p.getDescripcion());
		prod.setDescripcionDTO(p.getDescripcion());
		prod.setPrecioDTO(p.getPrecio());
		prod.setStockDTO(p.getStock());
		// TODO Auto-generated method stub
		return prod;
	}

}
