package cibertec.edu.pe.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonParseException;

import cibertec.edu.pe.model.Usuario;
import net.sf.jasperreports.engine.JRException;

public interface IUsuarioSrvice {
	public List<Usuario> ListarUsuario();
	public Usuario guardarUsuario(Usuario usuario);
	public Optional<Usuario> buscarUsuario(int codigo);
	public void eliminarUsario(int codigo);
	byte[] exportPdf() throws JRException, FileNotFoundException;

}
