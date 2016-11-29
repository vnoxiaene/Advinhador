
public class ReverterString implements Embaralhador{

	@Override
	public String embaralhaTudo(String palavra) {
		String result = new StringBuffer(palavra).reverse().toString();
		return result;
	}

}
