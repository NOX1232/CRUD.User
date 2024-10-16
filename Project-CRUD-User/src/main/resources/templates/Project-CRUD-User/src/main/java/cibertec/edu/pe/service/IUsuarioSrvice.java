package cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import cibertec.edu.pe.model.Usuario;

public interface IUsuarioSrvice {
	public List<Usuario> ListarUsuario();
	public Usuario guardarUsuario(Usuario usuario);
	public Optional<Usuario> buscarUsuario(int codigo);
	public void eliminarUsario(int codigo);

}
