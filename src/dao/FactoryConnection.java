package dao;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.UnsupportedEncodingException;
import java.security.*;

/**
 * Essa classe retorna uma conex�o com o banco de dados por meio da utliza��o do
 * mysql connector
 */
public class FactoryConnection {
	/**
	 * Esse m�todo cria e retorna a conex�o
	 * 
	 * @return retorna um objeto do tipo Connection
	 */
	public Connection getConnection() {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/adventuresLife",
					"root", "");
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conexao;
	}
	
	public String criptografarSenha(String senha) throws NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException{
			MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
			 
			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
			  hexString.append(String.format("%02X", 0xFF & b));
			}
			
			return hexString.toString();
	}
}
