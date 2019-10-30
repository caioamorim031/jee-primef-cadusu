package br.com.testedev.cadastrousuario.negocio;

import br.com.testedev.cadastrousuario.dao.UsuarioDAO;
import br.com.testedev.cadastrousuario.exception.CadastroException;
import br.com.testedev.cadastrousuario.model.UsuarioBean;

public class UsuarioNegocio {
	
	public boolean cadastraUsuario(UsuarioBean pUsuario) throws CadastroException{
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		return usuarioDAO.cadastroUsuario(pUsuario);
	}
	
	public boolean buscaUsuario (UsuarioBean pUsuario) throws CadastroException {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		return usuarioDAO.buscaUsuario(pUsuario);
	}

}
