package modelo;

public class Compra {
	protected String dataCompra;
	protected double valorTotal;
	
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double[] valores) {
		int i = 0;
		
		while(i < valores.length) {
			this.valorTotal = valores[i];
		}
		
	}
	
}
