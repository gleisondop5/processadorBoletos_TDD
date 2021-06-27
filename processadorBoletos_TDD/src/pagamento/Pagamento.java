package pagamento;

import java.util.Date;

public class Pagamento {
	
	private double valorPago;
	private Date dataPagamento;
	private String tipoPagamento;
	
	public Pagamento(double valorPago, Date dataPagamento, String tipoPagamento) {		
		this.valorPago = valorPago;
		this.dataPagamento = dataPagamento;
		this.tipoPagamento = tipoPagamento; 
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public Date getDataPagamento() {
		Date myDate = new Date(2014, 02, 11);
		return myDate;
	}
}
