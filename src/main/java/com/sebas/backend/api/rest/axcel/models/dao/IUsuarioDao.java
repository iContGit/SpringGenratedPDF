package com.sebas.backend.api.rest.axcel.models.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sebas.backend.api.rest.axcel.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	Optional<Usuario> findByNombre(String nombre);
	

}
