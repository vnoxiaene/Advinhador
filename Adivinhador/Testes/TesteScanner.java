import static org.junit.Assert.*;

import org.junit.Test;

public class TesteScanner {

//	@Test
//	public void TesteLeArquivo() {
//		BancoDePalavras b = new BancoDePalavras();
//		b.leArquivo();
//		assertTrue(b.palavras.contains("lapis"));
//	}

	@Test
	public void testeExistePalavra(){
		BancoDePalavras b = new BancoDePalavras();
		assertTrue(b.contemPalavra("lapis"));
	}
	
}
