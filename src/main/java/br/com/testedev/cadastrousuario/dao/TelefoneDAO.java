package br.com.testedev.cadastrousuario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.testedev.cadastrousuario.exception.CadastroException;
import br.com.testedev.cadastrousuario.factory.ConnectionFactory;
import br.com.testedev.cadastrousuario.model.UsuarioBean;

public class TelefoneDAO {
	
private Connection conexao = null;
	
	
	public boolean cadastroUsuario(UsuarioBean pUsuario) throws CadastroException {
		
		String sql = " INSERT INTO PUBLIC.TELEFONE(cd_usuario, ddd, numero) VALUES (? , ?)";
		boolean inseriu = false;
		
		try {
			conexao = ConnectionFactory.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, pUsuario.getEmail());
			stmt.setString(2, pUsuario.getSenha());
			stmt.execute();
			conexao.commit();
			
			ResultSet rs = stmt.getGeneratedKeys();
			while(rs.next()){
				pUsuario.setCdUsuario(rs.getInt(1));
				inseriu = true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		} finally {
			try {
				conexao.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return inseriu;
	}
	
}
