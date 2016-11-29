import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanica();
		Scanner in = new Scanner(System.in);
		System.out.println("------------------- Jogo do Adivinhador -----------------");
		System.out.println("Tipo do Jogo: "+mecanica.getNome());
		System.out.println("Descrição do jogo: "+mecanica.getDescricao()+"\n\n");
		
		while(!mecanica.verificaJogo()){
			String palavra = mecanica.proximaPalavra();
			Embaralhador emb = FabricaEmbaralhadores.getEmbaralhador();
			String palavraembaralhada = emb.embaralhaTudo(palavra);
			System.out.println("A palavra é: "+palavraembaralhada);
			String chute = in.nextLine();
			String resultado = mecanica.verificaResposta(palavra, chute);
			System.out.println(resultado);
		}
		System.out.println(mecanica.resultadoFinal());	
	}

}
