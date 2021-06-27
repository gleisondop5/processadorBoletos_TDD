package pagamento;

import static org.junit.Assert.assertNotNull;
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
}
