package br.com.testedev.cadastrousuario.exception;

public class CadastroException extends Exception {
	
	public CadastroException(String arg){
		super(arg);
	}
	
	public CadastroException(Throwable arg){
		super(arg);
	}
	
	public CadastroException(String arg, Throwable arg1){
		super(arg, arg1);
	}
}
