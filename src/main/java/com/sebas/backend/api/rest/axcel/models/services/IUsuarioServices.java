package com.sebas.backend.api.rest.axcel.models.services;

import java.util.List;

import com.sebas.backend.api.rest.axcel.models.entity.Usuario;

public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
//	public Usuario findByCedula(String cedula);
	
	public Usuario findByNombre(String nombre);
	
	public List<Usuario> findByName(String nombre);
	
	public List<Usuario> findByCedula(String nombre);
	
	
	public Usuario save(Usuario usuario);
	
	public void delete (Long id);
	

}
