package exercicio;

public class Recursao {
	private int valor;
	
	public static int fatorial(int valor) {
		Util.text(valor+" * ");
		if(valor == 1) {
			return valor;
		}
		return fatorial(valor-1)*valor;
	}

}
