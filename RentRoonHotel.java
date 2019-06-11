package jav.curscomplet;

import java.util.Scanner;

public class RentRoonHotel {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Roon[] rent = new Roon[10];
		int numRoons;
		System.out.print("How many roons will be rented?: ");
		numRoons = sc.nextInt();
		
		rent = add(numRoons);
		
		listar(rent);
		
		sc.close();
	}
	
	public static Roon[] add(int numRoons) {
		Roon[] rent = new Roon[11];
		for(int i = 1;i<numRoons+1;i++) {
			System.out.println("Rent#"+i);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Roon: ");
			int num = sc.nextInt();
			rent[num] = new Roon(num,name,email);
		}
		return rent;
	}
	
	public static void listar(Roon[] rent) {
		System.out.println("Busy roons: ");
		for(int i = 1 ;i<rent.length; i++) {
			if(rent[i]!=null) {
				Roon roon = rent[i];
				System.out.println(roon.getNum()+": "+roon.getName()+", "+roon.getEmail());
			}
		}
	}
}

class Roon{
	int num;
	String name;
	String email;
	
	public Roon(int num,String name, String email) {
		this.num = num;
		this.name = name;
		this.email = email;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
