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
		return 0;
	}
}
