import static org.junit.Assert.*;

import org.junit.Test;

public class TestePalavras {

	@Test
	public void testeGetPalavra() {
		BancoDePalavras banco = new BancoDePalavras();
		banco.inicializaPalavras();
		assertNotEquals("carro", banco.getPalavra()); 
	}

}
