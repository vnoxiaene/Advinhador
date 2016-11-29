
public class TudoOuNada implements MecanicaDoJogo {
	
	private BancoDePalavras banco = new BancoDePalavras();
	private boolean perdeu = false;
	private int acertos = 0;
	
	@Override
	public String getNome() {
		return "Tudo ou Nada";
	}

	@Override
	public String getDescricao() {
		return "Tente acertar o máximo de palavras";
	}

	@Override
	public String proximaPalavra() {
		return banco.getPalavra();
	}

	@Override
	public boolean verificaJogo() {
		return perdeu;
	}

	@Override
	public String verificaResposta(String palavra, String resposta) {
		if (palavra.equals(resposta)){
			acertos++;
			return "Certa Resposta!";
		}
		else{
		perdeu = true;	
		return "Resposta errada! Já era!";
		}
	}

	@Override
	public String resultadoFinal() {
		return "Resultado: "+acertos+" acertos apenas.";
	}

	
}
