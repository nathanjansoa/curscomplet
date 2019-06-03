package jav.curscomplet;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		saidaDados();
		sc.close();
	}
	
	//Saida de dados
	public static void saidaDados() {
		Util.titulo("Saida de Dados");
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s , which price is %.2f%n%s , which price is %.2f %n",product1,price1,product2,price2);
		System.out.printf("Record: %d years old, code %d and gender: %c %n",age,code,gender);
		System.out.printf("Measue with eight decimal places: %.8f %n",measure);
		System.out.printf("Rouded (three decimal places): %.3f %n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n",measure);
	}
	
	//Scaner
	public static void scaner() {
		Util.titulo("Scanner");
		Util.textLn("Enter your full name:");
		// Alex Green
		Util.textLn("How many bedrooms are there in your house?");
		// 3
		Util.textLn("Enter product price:");
		// 500.50
		Util.textLn("Enter your last name, age and height (same line):");
		// Green 21 1.73
		// SAÍDA ESPERADA (NÚMEROS REAIS
		// COM DUAS CASAS DECIMAIS):
		// Alex Green
		// 3
		// 500.50
	}
}