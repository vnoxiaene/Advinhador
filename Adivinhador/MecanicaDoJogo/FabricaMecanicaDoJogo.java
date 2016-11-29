import java.util.Random;

public class FabricaMecanicaDoJogo {

	public static MecanicaDoJogo getMecanica(){
		Random r = new Random();
		int valor = r.nextInt()%2;
		if (valor == 0)
		{
		return new OuCemOuZero();
		}
		else return new TudoOuNada();
	}
}
