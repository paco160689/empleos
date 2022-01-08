package com.frus.service;

import java.util.List;

import com.frus.model.Usuario;

public interface IUsuariosService {
	
	List<Usuario> buscarTodos();
	
	List<Usuario> buscarRegistrados();
	
	void guardar(Usuario usuario);
	
	void eliminar(Integer idUsuario);
	
	Usuario buscarPorUsername(String username);
	
	int bloquear(int idUsuario);
	
	int activar(int idUduario);
}
