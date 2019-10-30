package br.com.testedev.cadastrousuario.model;

public class TelefoneBean {

	private Integer cdUsuario;
	private Integer cdTelefone;
	private Integer DDD;
	private String numero;
	private String tipo;
	
	public Integer getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Integer cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	public Integer getCdTelefone() {
		return cdTelefone;
	}
	public void setCdTelefone(Integer cdTelefone) {
		this.cdTelefone = cdTelefone;
	}
	public Integer getDDD() {
		return DDD;
	}
	public void setDDD(Integer dDD) {
		DDD = dDD;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
