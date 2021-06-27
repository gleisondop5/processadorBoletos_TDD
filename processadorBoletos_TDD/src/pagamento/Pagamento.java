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
		return dataPagamento;
	}
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
