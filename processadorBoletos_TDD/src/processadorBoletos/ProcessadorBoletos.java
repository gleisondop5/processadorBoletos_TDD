package processadorBoletos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorBoletos {
	
	private ArrayList<Boleto> boletos;
	private Fatura fatura;
	
	
	public ProcessadorBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		this.boletos = boletos;
		this.fatura = fatura;
	}
	
	public double getValorTotalBoletos() {
		double valorTotalBoletos = 0;
		for (Iterator i = boletos.iterator(); i.hasNext();) {
			Boleto boleto = (Boleto) i.next();
			valorTotalBoletos += boleto.getValorPago();
		}
		return valorTotalBoletos;
	}
	
	public ArrayList<Pagamento> criarPagamento() {
		ArrayList<Pagamento> pagamentoBoletos = new ArrayList();		 
		for (Iterator i = boletos.iterator(); i.hasNext();) {			
			Boleto boleto = (Boleto) i.next();
			double valorBoleto = boleto.getValorPago();
			Date dataPagamento = new Date();			 
			Pagamento pagamento = new Pagamento(valorBoleto, dataPagamento, "Boleto");
			pagamentoBoletos.add(pagamento);
		}
		return pagamentoBoletos;
	}

}
