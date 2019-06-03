package jav.curscomplet;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		saidaDados();
		scaner();
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
		Locale.setDefault(Locale.US);
		Util.titulo("Scanner");
		Util.textLn("Enter your full name:");
		String name = sc.nextLine().toString();
		// Alex Green
		Util.textLn("How many bedrooms are there in your house?");
		int bedroon = sc.nextInt();
		// 3
		Util.textLn("Enter product price:");
		double price = sc.nextDouble();
		// 500.50
		Util.textLn("Enter your last name, age and height (same line):");
		String last = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(name);
		System.out.println(bedroon);
		System.out.println(price);
		System.out.println(last);
		System.out.println(age);
		System.out.println(height);
	}
}