import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteEmbaralhadores {
	
	Embaralhador f,g,h;
	@Before
	public void inicializa(){
		f = new ReverterString();
		g = new UmParaTras();
		h = new DoisParaFrenteEmbaralhar();
	}
	@Test
	public void testaReverseString() {
		assertEquals("asac",f.embaralhaTudo("casa"));
		
	}
	@Test
	public void testaDoisAfrente() {
		assertEquals("saca",h.embaralhaTudo("casa"));	
	}
	@Test
	public void testaumAtras() {
		assertEquals("asarc",g.embaralhaTudo("casar"));	
	}
	@Test
	public void fabricaEmbaralhador() {
		assertEquals(DoisParaFrenteEmbaralhar.class ,FabricaEmbaralhadores.getEmbaralhador().getClass());
	}
	
	}
