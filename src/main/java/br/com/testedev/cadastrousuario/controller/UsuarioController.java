package br.com.testedev.cadastrousuario.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.testedev.cadastrousuario.model.UsuarioBean;
import br.com.testedev.cadastrousuario.negocio.UsuarioNegocio;
import java.io.Serializable;


@Named("usuarioBean")
@ApplicationScoped
public class UsuarioController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7859572536481619541L;
	@Inject
	private UsuarioBean usuario;
	
	private boolean isLogado = false;
	
	@Inject
	public UsuarioController(){	
		usuario = new UsuarioBean();
		isLogado = false;
	}
	
	public UsuarioBean getUsuario(){
		return this.usuario;
	}
	
	public void setUsuario(UsuarioBean pUsuario){
		this.usuario = pUsuario;
	}
	
	public boolean isLogado(){
		return this.isLogado;
	}
	
	public void doLogin() {
		UsuarioNegocio RNUsuario = new UsuarioNegocio();
		
		
		
		try {
			if(		(usuario.getEmail() == null || usuario.getEmail().isEmpty()) 
						|| 
					(usuario.getSenha().isEmpty() || usuario.getSenha() == null )
					){
				throw new Exception();
			}
			if(RNUsuario.buscaUsuario(usuario)){
				this.isLogado = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
