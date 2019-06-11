package jav.curscomplet;

import java.util.Scanner;

public class CalcAreaTriang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Util.textLn("Digit the a b and c areas for the Triangle X at the same line:");
		double areaTotalX = calcArea(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		Util.textLn("Digit the a b and c areas for the Triangle Y at the same line:");
		double areaTotalY = calcArea(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Area Triangle X: "+areaTotalX);
		System.out.println("Area Triangle Y: "+areaTotalY);
		Util.textLn("Larger area: "+compare( areaTotalX, areaTotalY));
		sc.close();
	}
	
	public static double calcArea(double a,double b,double c) {
		double areaTotal;
		double p = (a+b+c)/2.0;
		areaTotal = Math.sqrt(p*((a-p)*(b-p)*(c-p)));
		return areaTotal;
	}
	
	public static char compare(double a,double b) {
		char maior;
		if(a==b) {
			maior = 'n';
		}else if(a>b){
			maior = 'X';
		}else {
			maior = 'Y';
		}
		return maior;
	}
}
