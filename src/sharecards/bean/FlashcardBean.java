package sharecards.bean;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import sharecards.dao.FlashcardDAO;
import sharecards.dao.JDBCFlashcardDAO;
import sharecards.model.Flashcard;
import sharecards.model.Usuario;

@ManagedBean(name = "flashcardBean")
public class FlashcardBean {
	
	private String nomeFlashcard, categoriaFlashcard, frenteFlashcard, trasFlashcard, imageFlashcard, codigoFlashcard,
	 codigoUsuario, autorFlashcard;
	//FlashcardDAO fc= new JDBCFlashcardDAO();
	private ArrayList<Flashcard> dados; //= fc.obterFlashcard();
	
	
	public void insereFlashcard() throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException{
		Flashcard flash = new Flashcard();
		UsuarioBean ub = new UsuarioBean();
		flash.setCodigoUsuario(ub.getCodigoUsuario());
		flash.setNomeFlashcard(nomeFlashcard);
		flash.setCategoriaFlashcard(categoriaFlashcard);
		flash.setImageFlashcard(imageFlashcard);
		flash.setFrenteFlashcard(frenteFlashcard);
		flash.setTrasFlashcard(trasFlashcard);
		flash.setAutorFlashcard(autorFlashcard);
		
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		edFl.insereFlashcard(flash);
	}
	
	public void insereFlashcardSemIMG() throws ClassNotFoundException, SQLException{
		Flashcard flash = new Flashcard();
		UsuarioBean ub = new UsuarioBean();
		flash.setCodigoUsuario(ub.getCodigoUsuario());
		flash.setNomeFlashcard(nomeFlashcard);
		flash.setCategoriaFlashcard(categoriaFlashcard);
		flash.setFrenteFlashcard(frenteFlashcard);
		flash.setTrasFlashcard(trasFlashcard);
		flash.setAutorFlashcard(autorFlashcard);
		
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		edFl.insereFlashcard(flash);
	}
	
	public int removeFlashcard() throws ClassNotFoundException, SQLException{
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		int deletCount = edFl.removeFlashcard(codigoFlashcard);
		return deletCount;
		
	}
	
	public ResultSet consultaFlashcard() throws ClassNotFoundException, SQLException{
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		ResultSet rs = edFl.consultaFlashcard(codigoFlashcard);
		return rs;
	}
	
	public void editarFlashcard() throws ClassNotFoundException, SQLException{
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		edFl.editarFlashcard(frenteFlashcard, trasFlashcard, codigoFlashcard);
	}
	
	public Flashcard retornaFlashcard(Usuario u, String codigoFlashcard) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException, ParseException{
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		Flashcard fl = edFl.retornaFlashcard(codigoUsuario,codigoFlashcard);
		return fl;
	}
	
	public ArrayList<Flashcard> getDados(){
		FlashcardDAO edFl = new JDBCFlashcardDAO();
		dados = edFl.obterFlashcard(codigoUsuario,codigoFlashcard);
		return dados;
	}
	
	/*public void mostrarBiblioteca(Usuario usuario) throws SQLException{
		
	}*/
}
