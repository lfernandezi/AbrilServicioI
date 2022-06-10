package com.idat.AbrilServicioI.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AbrilServicioI.dto.UsuarioRequestDTO;
import com.idat.AbrilServicioI.dto.UsuarioResponseDTO;
import com.idat.AbrilServicioI.seguridad.JwtTokenUtil;
import com.idat.AbrilServicioI.seguridad.UsuarioDetalle;

@RestController
public class UsuarioControlador {
	
	@Autowired
	private JwtTokenUtil util;
	
	@Autowired
	private UsuarioDetalle service;
	
	@RequestMapping(path = "/crearToken",method=RequestMethod.POST)
	private ResponseEntity<?> crearToken(@RequestBody UsuarioRequestDTO dto){
		
		UserDetails details = service.loadUserByUsername(dto.getUsuario());
		
		return ResponseEntity.ok(new UsuarioResponseDTO(util.generateToken(details.getUsername())));
	}

}
