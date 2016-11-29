import java.util.ArrayList;
import java.util.Random;


public class BancoDePalavras {
	
	
	private ArrayList<String> palavras = new ArrayList<String>(); 
	
	
	protected void inicializaPalavras(){
		palavras.add("lapis");
		palavras.add("casa");
		palavras.add("rosa");
		palavras.add("bau");
		palavras.add("caneta");
		palavras.add("computador");
		palavras.add("bigode");
		palavras.add("mario");
		palavras.add("luigi");
		palavras.add("calcinha");
		palavras.add("café");
		palavras.add("branco");
		palavras.add("astronauta");
		palavras.add("pantera");
		palavras.add("jumento");
		palavras.add("nvidia");
		palavras.add("javascript");
		palavras.add("cuda");
		palavras.add("mestrado");
		palavras.add("calcualar");
	}
	public boolean contemPalavra(String palavra){
		inicializaPalavras();
		if (palavras.contains(palavra)){
		return true;
		}
		else return false;
	}
	public String getPalavra(){
		inicializaPalavras();
		Random r = new Random();
		int sorteado = Math.abs(r.nextInt() % palavras.size());
		return palavras.get(sorteado);
	}
	
	}
	
