package exercicio;

public enum Animal {
	DOG("Max"),CAT("Ton"),MOUSE("Jerry");
	
	private String name;
	
	Animal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "The name of this animal its "+ this.name;
	}
}
