package jav.curscomplet;

public class MathTest {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double w = 6.2;
		double k = 6.6;
		double n = 1.0;
		double a,b,c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("A raiz quadrada de "+ x +" = "+ a);
		System.out.println("A raiz quadrada de "+ y +" = "+b);
		System.out.println("A raiz quadrada de 25 = "+c);
		
		a = Math.pow(x,y);
		b = Math.pow(x,2.0);
		c = Math.pow(5.0,2.0);
		System.out.println(x +" elevado a "+ y +" = "+ a);
		System.out.println(x +" elevado ao quadrado = "+ b);
		System.out.println("5  elevado ao quadrado  = "+ c);
		
		a = Math.abs(y);
		b = Math.abs(z);
		c = Math.abs(w);
		System.out.println("O valor absoluto de "+ y +" = "+ a);
		System.out.println("O valor absoluto de "+ z +" = "+ b);
		System.out.println("O valor absoluto de "+ w +" = "+ c);
		
		a = Math.ceil(w);
		b = Math.floor(w);
		c = Math.ceil(k);
		System.out.println("Returns the smallest "+ w +" = "+ a);
		System.out.println("Returns the smallest "+ k +" = "+ c);
		System.out.println("Returns the largest "+ w +" = "+ b);
		c = Math.floor(k);
		System.out.println("Returns the largest "+ k +" = "+ c);
		
		a = Math.max(w,x);
		b = Math.min(w,x);
		System.out.println("Returns the greater of two  "+ w +" and "+ x +" = "+ a);
		System.out.println("Returns the smaller of two  "+ w +" and "+ x +" = "+ b);
		
		a = Math.exp(n);
		b = Math.expm1(n);
		System.out.println("Returns Euler's number 2.71828 elevado ao valor "+ n +"  = "+ a);
		System.out.println("Returns  Euler's number 2.71828 ex -1.elevado ao valor "+ n +"  = "+ b);
		
		a = Math.log(w);
		b = Math.log(n);
		System.out.println("Returns the natural logarithm (base e) of a value "+ w +"  = "+ a);
		System.out.println("Returns the natural logarithm (base e) of a value "+ n +"  = "+ b);
		
		a = Math.random();
		System.out.println("Returns the random value  = "+ a);
		
		a = Math.round(w);
		b = Math.round(k);
		System.out.println("Returns the closest long to the argument of "+ w +"  = "+ a);
		System.out.println("Returns the closest long to the argument of "+ k +"  = "+ b);
	}
}