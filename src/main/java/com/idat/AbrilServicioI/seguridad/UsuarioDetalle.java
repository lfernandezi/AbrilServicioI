package com.idat.AbrilServicioI.seguridad;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicioI.modelo.Usuario;
import com.idat.AbrilServicioI.repositorio.UsuarioRepositorio;

@Service
public class UsuarioDetalle implements UserDetailsService{

	@Autowired
	private UsuarioRepositorio repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario= repo.findByUsuario(username);
		
		if(usuario != null) {
			List<GrantedAuthority> granted = new ArrayList<GrantedAuthority> ();
			
			GrantedAuthority authority = new SimpleGrantedAuthority(usuario.getRol());
			granted.add(authority);
			
			return new User(usuario.getUsuario(), usuario.getPassword(), granted);
			
		}else {
			throw new UsernameNotFoundException("El usuario no existe");
		}
	}
	
	
}
