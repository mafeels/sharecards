package modelo;

public class Compra {
	protected String dataCompra;
	protected double valorTotal;
	/**
	 * Função para pegar data da compra
	 * @return
	 */
	
	public String getDataCompra() {
		return dataCompra;
	}
	/**
	 * Função para definir data da compra
	 * 
	 * @param dataCompra
	 */
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	/**
	 * Função para pegar valor total da compra
	 * 
	 * @return
	 */
	public double getValorTotal() {
		return valorTotal;
	}
	/**
	 * Função para definir valor total da compra
	 * 
	 * @param valores
	 */
	public void setValorTotal(double[] valores) {
		int i = 0;
		
		while(i < valores.length) {
			this.valorTotal = valores[i];
		}
		
	}
	
}
