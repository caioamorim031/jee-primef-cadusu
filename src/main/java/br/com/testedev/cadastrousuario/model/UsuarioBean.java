package br.com.testedev.cadastrousuario.model;

public class UsuarioBean {
	
	private Integer cdUsuario;
	private String email;
	private String senha;
	
	public Integer getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Integer cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
