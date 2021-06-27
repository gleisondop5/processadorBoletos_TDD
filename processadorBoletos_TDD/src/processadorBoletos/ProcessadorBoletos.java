package processadorBoletos;

import java.util.ArrayList;
import java.util.List;

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
		return 0;
	}

}
