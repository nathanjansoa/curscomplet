package jav.curscomplet;

import java.util.List;
import java.util.Locale;

public class Util {
	// Imprime em linhas diferentes
	public static void textLn(String txt) {
		System.out.println(txt);
	}
	public static void textLn(int txt) {
		System.out.println(txt);
	}

	// Imprime na mesma linha
	public static void text(String txt) {
		System.out.print(txt+" ");
	}
	public static void text(int vl) {
		System.out.print(vl+" ");
	}

	// Imprime resultado
	public static void textEsp(Object vl) {
		//Define a regra para pontuação do país
		Locale.setDefault(Locale.US);
		System.out.printf("Resultado = %d.%n", vl);
	}
	
	// Imprime resultado
	public static void textEsp(String vl) {
		StringBuilder str = new StringBuilder();
		str.append("Resultado = ").append(vl).append(".\n");
		System.out.print(str.toString());
	}

	// Imprime titulo
	public static void titulo(String txt) {
		System.out.println("_---------------- " + txt + " ----------------_");
	}
	
	// Imprime arrayList
	public static void impLista(List<?> list) {
		for (Object arrayList : list) {
			textLn(arrayList.toString());
		}
	}
}