package com.pe.oauth.app.services;

import com.pe.usuarios.commons.app.models.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	public Usuario update(Usuario usuario,Long id);

}
