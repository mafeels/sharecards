package modelo;

import java.security.SecureRandom;
import java.math.BigInteger;
import java.sql.Date;


public class Flashcard {

	protected String nomeFlashcard, categoriaFlashcard, frenteFlashcard, trasFlashcard, imageFlashcard, codigoFlashcard,
		 codigoUsuario, autorFlashcard;
	protected double precoFlashcard;
	private SecureRandom random = new SecureRandom();
	Date dataCriacao;
	/**
	 * Função construtora principal
	 * 
	 * @param nomeFlashcard
	 * @param categoriaFlashcard
	 * @param frenteFlashcard
	 * @param trasFlashcard
	 * @param codigoUsuario
	 * @param autorFlashcard
	 * @param dataCriacao
	 * @param imageFlashcard
	 * @param codigoFlashcard
	 */
	
	public Flashcard(String nomeFlashcard, String categoriaFlashcard, String frenteFlashcard, String trasFlashcard, String codigoUsuario,
			String autorFlashcard, Date dataCriacao, String imageFlashcard, String codigoFlashcard) {
		this.nomeFlashcard = nomeFlashcard;
		this.categoriaFlashcard = categoriaFlashcard;
		this.frenteFlashcard = frenteFlashcard;
		this.trasFlashcard = trasFlashcard;
		this.codigoFlashcard = codigoFlashcard;
		this.codigoUsuario = codigoUsuario;
		this.autorFlashcard = autorFlashcard;
		this.precoFlashcard = 0;
		this.dataCriacao = dataCriacao;
		this.imageFlashcard = imageFlashcard;
	}
	/**
	 * Função construtora secundaria
	 * 
	 * @param nomeFlashcard
	 * @param categoriaFlashcard
	 * @param frenteFlashcard
	 * @param trasFlashcard
	 * @param codigoUsuario
	 * @param autorFlashcard
	 * @param dataCriacao
	 */
	public Flashcard(String nomeFlashcard, String categoriaFlashcard, String frenteFlashcard, String trasFlashcard, String codigoUsuario,
			String autorFlashcard, Date dataCriacao) {
		this.nomeFlashcard = nomeFlashcard;
		this.categoriaFlashcard = categoriaFlashcard;
		this.frenteFlashcard = frenteFlashcard;
		this.trasFlashcard = trasFlashcard;
		this.codigoUsuario = codigoUsuario;
		this.autorFlashcard = autorFlashcard;
		this.precoFlashcard = 0;
		this.dataCriacao = dataCriacao;

	}
	/**
	 *  Função para pegar nome do flashcard
	 *  
	 * @return
	 */

	public String getNomeFlashcard() {
		return nomeFlashcard;
	}
	/**
	 * Função para definir nome do flashcard
	 * 
	 * @param nomeFlashcard
	 */

	public void setNomeFlashcard(String nomeFlashcard) {
		this.nomeFlashcard = nomeFlashcard;
	}
	/**
	 * Função para pegar categoria do flashcard
	 * 
	 * @return
	 */

	public String getCategoriaFlashcard() {
		return categoriaFlashcard;
	}
	
	/**
	 * Função para definir categoria do flashcard
	 * 
	 * @param categoriaFlashcard
	 */
	public void setCategoriaFlashcard(String categoriaFlashcard) {
		this.categoriaFlashcard = categoriaFlashcard;
	}
	/**
	 * Função para pegar frente do flashcard
	 * 
	 * @return
	 */
	public String getFrenteFlashcard() {
		return frenteFlashcard;
	}
	/**
	 * Função para definir frente do flashcard
	 * 
	 * @param frenteFlashcard
	 */
	public void setFrenteFlashcard(String frenteFlashcard) {
		this.frenteFlashcard = frenteFlashcard;
	}
	/**
	 * Função para pegar verso do flashcard
	 * 
	 * @return
	 */

	public String getTrasFlashcard() {
		return trasFlashcard;
	}
	/**
	 * Função para definir verso do flashcard
	 * 
	 * @param trasFlashcard
	 */

	public void setTrasFlashcard(String trasFlashcard) {
		this.trasFlashcard = trasFlashcard;
	}
	/**
	 * Função para pegar caminho da imagem do flashcard
	 * 
	 * @return
	 */
	public String getImageFlashcard() {
		return imageFlashcard;
	}
	/**
	 * Função para definir caminho da imagem do flashcard
	 * 
	 * @param imageFlashcard
	 */

	public void setImageFlashcard(String imageFlashcard) {
		this.imageFlashcard = imageFlashcard;
	}
	/**
	 * Função para pegar preço do flashcard
	 * 
	 * @return
	 */

	public double getPrecoFlashcard() {
		return precoFlashcard;
	}
	/**
	 * Função para definir preço do Flashcard
	 * 
	 * @param precoFlashcard
	 */
	public void setPrecoFlashcard(double precoFlashcard) {
		this.precoFlashcard = precoFlashcard;
	}
	/**
	 * Função para pegar codigo do flashcard
	 * 
	 * @return
	 */

	public String getCodigoFlashcard() {
		return codigoFlashcard;
	}
	/**
	 * função para definir codigo do flashcard
	 * 
	 * @param codigoFlashcard
	 */

	public void setCodigoFlashcard(String codigoFlashcard) {
		this.codigoFlashcard = codigoFlashcard;
	}
	/**
	 * função para pegar codigo do usuario
	 * 
	 * @return
	 */
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	/**
	 * função para definir codigo de usuario
	 * 
	 * @param codigoUsuario
	 */
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	/**
	 * Função para gerar codigo aleatorio do flashcard
	 * 
	 */
	public void generatorCodeFC() {
		codigoFlashcard = new BigInteger(130, random).toString(32);
	}
	/**
	 * Função para editar nome do flashcard
	 * 
	 * @param novoNomeFlashcard
	 */
	
	public void editNome(String novoNomeFlashcard){
		this.nomeFlashcard = novoNomeFlashcard;
	}
	/**
	 * função para pegar autor do flashcard
	 * 
	 * @return
	 */
	public String getAutorFlashcard() {
		return autorFlashcard;
	}
	/**
	 * Função para definir autor do flashcard
	 * 
	 * @param autorFlashcard
	 */
	public void setAutorFlashcard(String autorFlashcard) {
		this.autorFlashcard = autorFlashcard;
	}
	/**
	 * Função que retorna data de criação
	 * 
	 * @return
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}
	/**
	 * Função para definir data de criação
	 * 
	 * @param dataCriacao
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}