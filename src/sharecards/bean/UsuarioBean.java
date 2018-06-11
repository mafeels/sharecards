package sharecards.bean;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.sql.ResultSet;
import java.sql.SQLException;

import sharecards.dao.JDBCUsuarioDAO;
import sharecards.dao.UsuarioDAO;
import sharecards.model.Usuario;

public class UsuarioBean {

	private String codigoUsuario, username, dataNascimento, senha, email, primeiroNome, ultimoNome;
	
	public void insereUsuario(Usuario u) throws ClassNotFoundException, SQLException{
		Usuario us = new Usuario();
		us.setCodigoUsuario(codigoUsuario);
		us.setUsername(username);
		us.setEmail(email);
		us.setDataNascimento(dataNascimento);
		us.setSenha(senha);
		us.setPrimeiroNome(primeiroNome);
		us.setUltimoNome(ultimoNome);
		
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		edUs.insereUsuario(us);
	} 
	
	public int removeUsuario(String codigoUsuario) throws ClassNotFoundException, SQLException{
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		int deletCount = edUs.removeUsuario(codigoUsuario);
        return deletCount;
	}

	public ResultSet consultaUsuario(String codigoUsuario) throws ClassNotFoundException, SQLException{
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		ResultSet rs = edUs.consultaUsuario(codigoUsuario);
		return rs;
	}
	
	public boolean validaLogin(String email, String senha) throws SQLException{
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		boolean confirm = edUs.validaLogin(email, senha);
		return confirm;
	}

	public Usuario retornaUsuario(String email, String senha) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException{
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		Usuario rUser = edUs.retornaUsuario(email, senha);
		return rUser;
	}
	
	public void alteraSenha(String email, String senha) throws SQLException{
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		edUs.alteraSenha(email, senha);
	}

	public void mostrarPerfil(Usuario u) throws SQLException{
		UsuarioDAO edUs = new JDBCUsuarioDAO();
		edUs.mostrarPerfil(u);
	}

}
