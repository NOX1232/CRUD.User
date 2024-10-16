package cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.model.Usuario;
import cibertec.edu.pe.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioSrvice{

	@Autowired
	private IUsuarioRepository repositorio;
	
	@Override
	public List<Usuario> ListarUsuario() {
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Optional<Usuario> buscarUsuario(int codigo) {
		return repositorio.findById(codigo);
	}

	@Override
	public void eliminarUsario(int codigo) {
		repositorio.deleteById(codigo);
	}

}
