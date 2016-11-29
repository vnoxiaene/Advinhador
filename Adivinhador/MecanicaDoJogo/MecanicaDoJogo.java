
public interface MecanicaDoJogo {

	String getNome();
	String getDescricao();
	String proximaPalavra();
	boolean verificaJogo();
	String verificaResposta(String palavra, String resposta);
	String resultadoFinal();
}
