package processadorBoletos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;


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
		fatura = new Fatura("luz", 3500.00, new Date());
		processador = new ProcessadorBoletos(boletos, fatura);
	}
	
	@Test
	@DisplayName("Testa getValorTotal")
	public void testGetValorTotal() {
		double valorTotalBoletos = processador.getValorTotalBoletos();
		assertEquals(3500.00, valorTotalBoletos);
	}
	
	@Test
	@DisplayName("Testa se pagamentos estão sendo gerados")
	public void testCriarPagamento() {
		ArrayList<Pagamento> pagamentoBoletos = processador.criarPagamento();
		int qtdPagamentos = pagamentoBoletos.size();
		assertEquals(3, qtdPagamentos);
	}
	
	@Test
	@DisplayName("Testa se status paga esta sendo atribuida corretamente caso o valor dos boletos seja igual ao da fatura")
	public void testPagaFatura() {
		Boleto boleto3 = new Boleto(123, new Date(), 800.00);
		Boleto boleto4 = new Boleto(456, new Date(), 1200.00);
		boletos = new ArrayList();
		boletos.add(boleto3);
		boletos.add(boleto4);
		fatura = new Fatura("telefone", 2000.00, new Date());
		processador = new ProcessadorBoletos(boletos, fatura);
		processador.pagaFatura();
		String statusFatura = fatura.getstatuFatura();
		assertEquals("Paga", statusFatura);
	}

	@Test
	@DisplayName("Testa se status não paga esta sendo atribuida corretamente")
	public void testNaoPagaFatura() {
		Boleto boleto3 = new Boleto(123, new Date(), 700.00);
		Boleto boleto4 = new Boleto(456, new Date(), 1200.00);
		boletos = new ArrayList();
		boletos.add(boleto3);
		boletos.add(boleto4);
		fatura = new Fatura("telefone", 2000.00, new Date());
		processador = new ProcessadorBoletos(boletos, fatura);
		processador.pagaFatura();
		String statusFatura = fatura.getstatuFatura();
		assertEquals("Não paga", statusFatura);
	}
	
	@Test
	@DisplayName("Testa se status paga esta sendo atribuida corretamente caso o valor dos boletos seja maior que a fatura")
	public void testPagaFatura2() {
		Boleto boleto3 = new Boleto(123, new Date(), 1000.00);
		Boleto boleto4 = new Boleto(456, new Date(), 1200.00);
		boletos = new ArrayList();
		boletos.add(boleto3);
		boletos.add(boleto4);
		fatura = new Fatura("telefone", 2000.00, new Date());
		processador = new ProcessadorBoletos(boletos, fatura);
		processador.pagaFatura();
		String statusFatura = fatura.getstatuFatura();
		assertEquals("Paga", statusFatura);
	}
}
