package pagamento;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PagamentoTest {
	
	private Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {
		pagamento = new Pagamento(1500.00, new Date(), "Boleto");
	}

	@Test
	@DisplayName("Testa se o pagamento foi criado")
	public void testPagamento() {	
		assertNotNull(pagamento);		
	}
	
	@Test
	@DisplayName("Testa getValorPago")
	public void testAddBoletos() {
		double valorPago = pagamento.getValorPago();
		assertEquals(1500.00, valorPago);
	}
	
	@Test
	@DisplayName("Testa setValorPago")
	public void testSetBoletos() {
		pagamento.setValorPago(1200.00);
		double valorPago = pagamento.getValorPago();
		assertEquals(1200.00, valorPago);
	}
	
	@Test
	@DisplayName("Testa getDataPagamento")
	public void testGetDataPagamento() {
		Date data = new Date();
		Date dataPagamento = pagamento.getDataPagamento();
		assertTrue(data.equals(dataPagamento));
	}
	
	@Test
	@DisplayName("Testa setDataPagamento")
	public void testSetDataPagamento() {
		Date data = new Date();
		pagamento.setDataPagamento(data);
		Date dataPagamento = pagamento.getDataPagamento();
		assertEquals(data, dataPagamento);
	}
	
	@Test
	@DisplayName("Testa getTipoPagamento")
	public void testGetTipoPagamento() {
		String tipoPagamento = pagamento.getTipoPagamento();
		assertEquals("Boleto", tipoPagamento);
	}
	
	@Test
	@DisplayName("Testa setTipoPagamento")
	public void testSetTipoPagamento() {
		pagamento.setTipoPagamento("Boleto");
		String tipoPagamento = pagamento.getTipoPagamento();
		assertEquals("Boleto", tipoPagamento);
	}
}

