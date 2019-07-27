package execoes.entities;

import execoes.exceptions.WithdrawExeption;

public class Acount {
	int number;
	String holder;
	double balance;
	double withdrawLimit;
	
	public Acount(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double withdraw) throws WithdrawExeption {
		if(this.getWithdrawLimit()<withdraw) {
			throw new WithdrawExeption("The amount exceeds withdraw limit");
		}else if(this.getBalance()< withdraw) {
			throw new WithdrawExeption("Not enough balance");
		}else {
			this.balance -= withdraw;			
		}
	}
}