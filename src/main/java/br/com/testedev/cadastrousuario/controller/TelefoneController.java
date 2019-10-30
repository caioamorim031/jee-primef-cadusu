package br.com.testedev.cadastrousuario.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.testedev.cadastrousuario.model.TelefoneBean;

@Named("usuarioBean")
@ApplicationScoped
public class TelefoneController {

	private TelefoneBean telefone;
	
	public TelefoneController(){
		telefone = new TelefoneBean();
	}
}
