package processadorBoletos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;


public class ProcessadorBoletosTest {
	
	ProcessadorBoletos processador;
	Fatura fatura;
	private ArrayList<Boleto> boletos = new ArrayList();
	Boleto boleto1 = new Boleto(123, new Date(), 1000.00);
	Boleto boleto2 = new Boleto(456, new Date(), 1200.00);
	Boleto boleto3 = new Boleto(789, new Date(), 1300.00);
	
	
	@BeforeEach
	public void inicializa() {
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);		
		processador = new ProcessadorBoletos(boletos, fatura);
	}
	
	@Test
	@DisplayName("Testa getValorTotal")
	public void testGetValorTotal() {
		double valorTotalBoletos = processador.getValorTotalBoletos();
		assertEquals(3500.00, valorTotalBoletos);
	}

}
