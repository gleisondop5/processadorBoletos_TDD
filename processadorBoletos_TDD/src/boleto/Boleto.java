package boleto;

import java.util.Date;

public class Boleto {
	
	private int codigo;
	private Date dataVencimento;
	private double valorPago;
	
	public Boleto(int codigo, Date dataVencimento, double valorPago) {
		super();
		this.codigo = codigo;
		this.dataVencimento = dataVencimento;
		this.valorPago = valorPago;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
}
