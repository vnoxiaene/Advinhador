
public class DoisParaFrenteEmbaralhar implements Embaralhador {

	@Override
	public String embaralhaTudo(String palavra) {
		char[] resultado = new char[palavra.length()];
		for (int i=0; i<palavra.length()-2;i++)
		{
			resultado[i]= palavra.charAt(i+2);
		}
		resultado[palavra.length()-2]= palavra.charAt(0);
		resultado[palavra.length()-1]= palavra.charAt(1);
		return String.valueOf(resultado);
	}

}
