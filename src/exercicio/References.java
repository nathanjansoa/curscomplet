package exercicio;

public class References {
	
	public static void references() {
		References app = new References();
		//===========================================
		int value = 7;
		System.out.println("1. Value is: " + value);
		app.show(value);
		System.out.println("4. Value is: " + value);
		//===========================================
		Person person = new Person("Bob");
		System.out.println("1. Person is: " + person.getName());
		app.show(person);
		System.out.println("4. Person is: " + person.getName());
	}
	
	public void show(int value) {
		System.out.println("2. Value is: " + value);
		value = 8;
		System.out.println("3. Value is: " + value);
	}
	
	public void show(Person person) {
		System.out.println("2. Person is: " + person.getName());
		person = new Person("Mike");
		person.setName("Sue");
		System.out.println("3. Person is: " + person.getName());
		
	}
}