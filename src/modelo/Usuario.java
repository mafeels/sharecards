package modelo;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;


public class Usuario {
	protected String codigoUsuario, username, dataNascimento, senha, email, primeiroNome, ultimoNome;
	private SecureRandom random = new SecureRandom();
	
	public Usuario(){
		
	}
	
	public Usuario(String primeiroNome, String ultimoNome, String username, String dataNascimento, String senha, String email) throws NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException{
		this.username = username;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.email = email;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}
	
	public Usuario(String primeiroNome, String ultimoNome, String username, String dataNascimento, String email) throws NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException{
		this.username = username;
		this.dataNascimento = dataNascimento;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
	}
	
	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void generatorCodeUS() {
		codigoUsuario = new BigInteger(130, random).toString(32);
	}	

	public boolean checkUsername(String username) {
		if(username == this.username) {
			return true;
		}
		return false;
	}
	
	public boolean checkSenha(String senha) {
		if(senha == this.senha) {
			return true;
		}
		return false;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	protected static String criptografarSenha(String senha) throws NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException{
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
		 
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
		  hexString.append(String.format("%02X", 0xFF & b));
		}
		
		return hexString.toString();
	}
}
