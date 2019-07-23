package exercicio;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 4801633306273802062L;
	// Constantes
	public final static String classNome = "PERSON";
	// Variaveis Estaticas pertencem a classe e nao ao objeto
	// nao precisa dar um new para serem utilizados
	private static int count = 0;
	// Variaveis pertencem ao objeto
	// para ser utilizados precisa do new
	private String name;
	//Nao salva no arquivo
	private int id;
	private transient String foreName;
	private int age;
	private boolean sex;
	private double pes;
	private double alt;

	// Construtor
	public Person() {
		this("","");
	}
	
	public Person(String name) {
		this(name, "");
	}
	
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public Person(String name, String foreName) {
		this.name = name;
		this.foreName = foreName;
		age = 0;
		sex = true;
		pes = 0;
		alt = 0;
		count++;
	}

	// Gets
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getForename() {
		return foreName;
	}

	public int getAge() {
		return age;
	}

	public boolean isSex() {
		return sex;
	}

	public double getPes() {
		return pes;
	}

	public double getAlt() {
		return alt;
	}

	// Sets se usa o this porque referencia 
	// a variavel da classe e nao do metodo
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setForeName(String forename) {
		this.foreName = forename;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	// Metodos
	public String completName() {
		String completName;
		completName = this.name + " " + this.foreName;
		return completName;
	}

	public void resumo() {
		Util.textLn("Oi meu nome é " + this.completName() + ((this.sex) ? " do genero masculino" : " do genero feminio")
				+ " tenho " + age + " anos, com " + alt + " de altura e peso " + pes + " quilos.");
	}
	// Metodos estatigos podem ser usados sem precisar dar um new na classe
	public static String vezes() {
		return "Executou o construtor: "+count;
	}
}
