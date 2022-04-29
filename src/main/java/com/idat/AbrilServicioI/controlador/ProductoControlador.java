package com.idat.AbrilServicioI.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AbrilServicioI.modelo.Productos;
import com.idat.AbrilServicioI.servicio.ProductoServicio;

@RestController
@RequestMapping("producto/v1")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio servicio;
	
	@RequestMapping(path="/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Productos>>  listarProducto(){
		
		return  new ResponseEntity <List<Productos>>(servicio.listarProducto(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Productos producto){
		servicio.guardarProducto(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/listar/{id}",method = RequestMethod.GET)
	public ResponseEntity<Productos> listarPorId(@PathVariable Integer id){
		Productos p= servicio.obtenerrProducto(id);
		
		if (p!=null) {
			return new ResponseEntity<Productos>(p,HttpStatus.OK);
		}else {
			return new ResponseEntity<Productos>(p,HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path="/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void> editar(@RequestBody Productos producto){
		
		Productos p= servicio.obtenerrProducto(producto.getIdproducto());
		if (p!=null) {
			servicio.editarProducto(p);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	
	}
	
	@RequestMapping(path="/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Productos p= servicio.obtenerrProducto(id);
		if (p!=null) {
			servicio.eliminarProducto(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	
	}
	
	
	
}
