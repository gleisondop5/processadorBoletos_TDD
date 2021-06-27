package processadorBoletos;

import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;
import fatura.Fatura;

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

}
