package jav.curscomplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Util.text("How many employees will be registered? ");
		int numEmployers = sc.nextInt();
		List<Funcionarios> employee = add(numEmployers);
		increase(employee);
		list(employee);
		
		sc.close();
	}
	
	public static List<Funcionarios> add(int numEmployers) {
		List<Funcionarios> employee = new ArrayList<>();
		for(int i = 0;i<numEmployers;i++) {
			System.out.println("Emplyoee#"+(i+1));
			Util.text("Id: ");
			int id = sc.nextInt();
			while(find(employee, id)) {
				Util.textLn("This Id already exists!");
				Util.text("Chose another Id: ");
				id = sc.nextInt();
			}
			Util.text("Name: ");
			String name = sc.next();
			Util.text("Salary: ");
			double salary = sc.nextDouble();
			employee.add(new Funcionarios(id,name,salary));
		}
		return employee;
	}
	
	public static void list(List<Funcionarios> employee) {
		for(Funcionarios func: employee) {
			System.out.println("");
			System.out.print("Id: "+func.getId());
			System.out.print(" Name: "+func.getNome());
			System.out.print(" Salary: "+func.getSalario());
		}
	}
	
	public static boolean find(List<Funcionarios> employee,int numEmployer) {
		Funcionarios funcionario = employee.stream().filter(x -> x.getId() == numEmployer).findFirst().orElse(null);

		if(funcionario != null) {
			return true;
		}else {			
			return false;
		}
	}
	
	public static List<Funcionarios> increase(List<Funcionarios> employee) {
		Util.text("Enter the employee id that will have salary increase:  ");
		int numEmployerIncrease = sc.nextInt();
		while(!find(employee, numEmployerIncrease)) {
			Util.textLn("This id does not exists!");
			Util.text("Chose another Id: ");
			numEmployerIncrease = sc.nextInt();
		}
		double salary = 0.0;
		boolean encontrado = false;
		// find(employee,numEmployerIncrease);
		for(Funcionarios funcionario : employee) {
			if(funcionario.getId() == numEmployerIncrease) {
				salary = funcionario.getSalario();
				Util.text("Enter the percentage:  ");
				int percent = sc.nextInt();
				salary += salary*(percent*0.01);
				funcionario.setSalario(salary);
				encontrado = true;
			}
		}
		if(!encontrado) {
			Util.text("This id does not exist!");
		}
	
		return employee;
	}

}

class Funcionarios {
	int id;
	String nome;
	double salario;
	
	public Funcionarios(int id,String nome,double salario) {
		this.id = id;
		this.nome= nome;
		this.salario = salario;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
