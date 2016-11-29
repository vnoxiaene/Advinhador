

public class UmParaTras implements Embaralhador{

	@Override
	public String embaralhaTudo(String palavra) {
		char[] resultado = new char[palavra.length()];
		for (int i=0; i<palavra.length()-1;i++)
		{
			resultado[i]= palavra.charAt(i+1);
		}
		resultado[palavra.length()-1]= palavra.charAt(0);
		return String.valueOf(resultado);
	}
	
	
	
}