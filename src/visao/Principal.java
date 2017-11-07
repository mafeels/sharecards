package visao;

import java.sql.SQLException;
import java.util.*;
import modelo.*;
import dao.*;


public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner in = new Scanner(System.in);
		int entrada;
		
		do{
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Fazer Login");
			entrada = in.nextInt();
			
			String primeiroNome, ultimoNome, username, email, senha, dataNascimento;
			UsuarioDAO usuarioDao = new UsuarioDAO();
			
			switch(entrada){
				case 1:
					Usuario sessao1;
					/// coment
					System.out.println("Primeiro Nome: ");
					primeiroNome = in.nextLine();
					System.out.println("Ultimo Nome: ");
					ultimoNome = in.nextLine();
					System.out.println("username: ");
					username = in.nextLine();
					System.out.println("email: ");
					email = in.nextLine();
					System.out.println("senha: ");
					senha = in.nextLine();
					System.out.println("Data de nascimento: ");
					dataNascimento = in.nextLine();
					
					sessao1 = new Usuario(primeiroNome, ultimoNome, username, dataNascimento, senha, email);
					
					
					usuarioDao.insereUsuario(sessao1);
					
					break;
				case 2:
					
					boolean valida = false;
					
					do {
					System.out.println("email: ");
					email = in.nextLine();
					System.out.println("senha: ");
					senha = in.nextLine();
					}while(valida);
					
					
					
					break;
				default:
					System.out.println("DIGITE UMA DAS OP��ES");
			
			}
		}while(entrada != 2);

	}
}
