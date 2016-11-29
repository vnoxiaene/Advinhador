
public class OuCemOuZero implements MecanicaDoJogo {
	private BancoDePalavras banco = new BancoDePalavras();
	private boolean terminou = false;
	private int pontos = 50;
	@Override
	public String getNome() {
		return "Ou Cem Ou 0";
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Voc� Ganha se Fizer 100 Pontos, ou perde se fizer 0 pontos.";
	}

	@Override
	public String proximaPalavra() {
		return banco.getPalavra();
	}

	@Override
	public boolean verificaJogo() {
		return terminou;
	}

	@Override
	public String verificaResposta(String palavra, String resposta) {

		if (palavra.equals(resposta)){
			pontos = pontos+10;
			if (pontos == 100){
				terminou = true;
			}
			return "Parab�ns, voc� ganhou 10 pontos, j� tem: "+pontos+" pontos.";
		}
		else {
			pontos = pontos - 20;
			if (pontos <= 0){
				terminou = true;
			}
			return "Errou!!! Cuidado, voc� tem "+pontos+" pontos.";
		}
	}

	@Override
	public String resultadoFinal() {
		if (pontos == 100 ){
			return "Voc� � o Campe�o, 100 pontos!";
		}
		else return "Derrotado, tente na pr�xima";
	}

}
