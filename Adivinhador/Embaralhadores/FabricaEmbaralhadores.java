import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores {

	private static ArrayList<Embaralhador> quemvaiembaralhar = new ArrayList<>();
	static
	{
		quemvaiembaralhar.add(new DoisParaFrenteEmbaralhar());
		quemvaiembaralhar.add(new UmParaTras());
		quemvaiembaralhar.add(new ReverterString());

	}
	public static Embaralhador getEmbaralhador(){
		Random valor = new Random();
		int sorteado = Math.abs(valor.nextInt(3) % quemvaiembaralhar.size());
		return quemvaiembaralhar.get(sorteado);
	}

}
