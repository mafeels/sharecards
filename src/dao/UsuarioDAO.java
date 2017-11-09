package dao;

import java.sql.*;
import modelo.Usuario;

public class UsuarioDAO {

	public void insereUsuario(Usuario u) throws ClassNotFoundException, SQLException {

		Connection conexao = new FactoryConnection().getConnection();

		// cria um preparedStatement
		String sql = "insert into usuario(primeiro nome, ultimo_nome, codigo_usuario, username, data_nascimento, senha, e_mail)	"
				+ "values ('?','?',?','?','?','?','?');";

		PreparedStatement stmt = conexao.prepareStatement(sql);

		u.generatorCodeUS();

		// preenche os valores
		stmt.setString(1, u.getPrimeiroNome());
		stmt.setString(2, u.getUltimoNome());
		stmt.setString(3, u.getCodigoUsuario());
		stmt.setString(4, u.getUsername());
		stmt.setString(5, u.getDataNascimento());
		stmt.setString(6, u.getSenha());
		stmt.setString(7, u.getEmail());

		// executa
		stmt.execute();
		stmt.close();
		conexao.close();
	}

	public int removeUsuario(String codigoUsuario) throws ClassNotFoundException, SQLException {
		Connection conexao = new FactoryConnection().getConnection();

		String sql = "DELETE FROM usuario WHERE codigo_usuario=?";

		PreparedStatement pstmt = conexao.prepareStatement(sql);

		pstmt.setString(1, codigoUsuario);
		int deleteCount = pstmt.executeUpdate();

		// System.out.println("Número de flashcards deletados: "+ deleteCount );

		conexao.close();

		return deleteCount;
	}

	public ResultSet consultaUsuario(String codigoUsuario) throws ClassNotFoundException, SQLException {
		Connection conexao = new FactoryConnection().getConnection();

		Statement stmt = conexao.createStatement();

		ResultSet rs = stmt.executeQuery("select * from usuario");

		return rs;
	}

}
