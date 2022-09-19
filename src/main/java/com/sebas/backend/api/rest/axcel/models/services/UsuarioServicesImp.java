package com.sebas.backend.api.rest.axcel.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.backend.api.rest.axcel.models.dao.IUsuarioDao;
import com.sebas.backend.api.rest.axcel.models.entity.Usuario;

@Service
public class UsuarioServicesImp implements IUsuarioServices{
	@Autowired
	private IUsuarioDao usuarioDao;
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		
		return (List<Usuario>) usuarioDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		
		return usuarioDao.findById(id).orElse(null);
	}
	@Override
	@Transactional(readOnly = true)
	public Usuario save(Usuario usuario) {		
		return usuarioDao.save(usuario);
	}
	@Override
	@Transactional(readOnly = true)
	public void delete(Long id) {
		usuarioDao.deleteById(id);		
	}
	
	public Usuario findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return usuarioDao.findByNombre(nombre).orElse(null);
	}
	@Override
	public List<Usuario> findByName(String nombre) {
		ArrayList<Usuario> user = new ArrayList<>();
		user.add(usuarioDao.findByNombre(nombre).orElse(null));
		return user;
	}
	@Override
	public List<Usuario> findByCedula(String cedula) {
		ArrayList<Usuario> user = new ArrayList<>();
		user.add(usuarioDao.findByCedula(cedula).orElse(null));
		return user;
	}
	
	

}
