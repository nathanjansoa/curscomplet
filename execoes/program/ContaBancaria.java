package execoes.program;

import java.util.Scanner;

import execoes.entities.Acount;
import execoes.exceptions.WithdrawExeption;

public class ContaBancaria {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: "); 
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Acount cont = new Acount(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			cont.withdraw(sc.nextDouble());
			
			System.out.print("New balance: "+cont.getBalance());
			System.out.println();
			System.out.print("Repeat: Y or N ");
			String repeat = sc.next();
			if(repeat.equals("y")){
				System.out.println();
				ContaBancaria.main(args);				
			}
			
		}catch (WithdrawExeption e) {
			System.out.println(e.getMessage());
			System.out.println();
			System.out.print("Repeat: Y or N ");
			String repeat = sc.next();
			if(repeat.equals("y")){
				System.out.println();
				ContaBancaria.main(args);				
			}
		}
	}
}
