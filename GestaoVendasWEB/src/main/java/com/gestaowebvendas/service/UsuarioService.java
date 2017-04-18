package com.gestaowebvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaowebvendas.entity.Usuario;
import com.gestaowebvendas.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository userReportorio; 
	
	public Usuario save(Usuario user){
		return userReportorio.saveAndFlush(user);
		
	}

	
}
