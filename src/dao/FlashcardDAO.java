package dao;

import java.sql.*;


import modelo.Flashcard;

public class FlashcardDAO {
	
	public void insereFlashcard(Flashcard f) throws ClassNotFoundException, SQLException {
		
		Connection conexao = new FactoryConnection().getConnection();
	      
	       // cria um preparedStatement
	       String sql = "insert into flashcard (codigo_flashcard, codigo_usuario, nome_flashcard, frente_flashcard, verso_flashcard, autor_flashcard, categoria_flashcard, data_criacao, preco_flashcard, imagem_flashcard)"
	       + "values (?,?,?,?,?,?,?,?,?,?)";
	    
		   PreparedStatement stmt = conexao.prepareStatement(sql);

	       // preenche os valores
	       stmt.setString(1, f.getCodigoFlashcard());
	       stmt.setString(2, f.getCodigoUsuario());
	       stmt.setString(3, f.getNomeFlashcard());
	       stmt.setString(4, f.getFrenteFlashcard());
	       stmt.setString(5, f.getTrasFlashcard());
	       stmt.setString(6, f.getAutorFlashcard());
	       stmt.setString(7, f.getCategoriaFlashcard());
	       stmt.setString(8, f.getDataCriacao().toString());
	       stmt.setDouble(9, f.getPrecoFlashcard());
	       stmt.setString(10, f.getImageFlashcard());	       
	       	      
	       // executa
	       stmt.execute();
	       stmt.close();
	       conexao.close();
	}
	public int removeFlashcard(String codigoFlashcard) throws ClassNotFoundException, SQLException {
		   
		Connection conexao = new FactoryConnection().getConnection();
	       
	       String sql = "DELETE FROM flashcard WHERE codigo_flashcard=?";  
	       PreparedStatement pstmt = conexao.prepareStatement(sql);  
	         
	       pstmt.setString(1, codigoFlashcard);  
	       int deleteCount = pstmt.executeUpdate(); 
	       
	       //System.out.println("Número de flashcards deletados: "+ deleteCount );  
	      
	       conexao.close();
	       
	       return deleteCount;
	}
	public ResultSet consultaFlashcard(String codigoFlashcard) throws ClassNotFoundException, SQLException {
		Connection conexao = new FactoryConnection().getConnection();
		
	       String sql = "select * from flashcard";
	       
	       Statement stmt = conexao.createStatement();
	                       
	       ResultSet rs = stmt.executeQuery("select * from flashcard");
	        
	       return rs;
	}
	public void editarFlashcard(String frente, String verso, String codigoFlashcard) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
	       Connection conexao = (Connection) java.sql.DriverManager
	                .getConnection("jdbc:mysql://localhost:3306/flashnotes"
	                , "root"
	                , "ifsp"  ); 
	       
	       String sql = "UPDATE  flashcard  SET frente_flashcard= '?', verso_flashcard='?' WHERE codigoFlashcard='?';"; 
	       
	       PreparedStatement stmt = conexao.prepareStatement(sql); 
	       
	       stmt.setString(1, frente);
	       stmt.setString(2, verso);
	       stmt.setString(3, codigoFlashcard);
	}
}
