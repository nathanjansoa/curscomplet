package exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Testes {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		// ---- LOOP -----
		Util.titulo("LOOP");
		testWhile();
		testFor();
		//testDo();
		//testSwitch();
		//testMultArray();
		testArray();
		testString();
		valueObjects();
		exeCast();
		casting();
		generics();
		anonymousClass();
		readFile();
		write();
		exeptions();
		tryWithResources();
		testEquals();
		innerClass();
		enumClass();
		recursivo();
		serialisar();
		serializarArray();
		references();
		arrayList();
		linkedList();
		hashMap();
		linkedHashMap();
		treeMap();
		hashSet();
		sorting();
		comparable();
		queues();
		iteratorTest();
		iterableTest();
		collectioExample();
		scan.close();
	}

	// While
	public static void testWhile() {
		int cont = 1;
		Util.titulo("WHILE");
		while (10 >= cont) {
			Util.text(cont);
			if(cont == 9) {
				break;
			}
			cont++;
		}
		Util.textLn("");
	}

	// For
	public static void testFor() {
		Util.titulo("FOR");
		for (int i = 1; i <= 10; i++) {
			Util.text(i);
		}
		Util.textLn("");
	}
	
	// Do
	public static void testDo() {
		Util.titulo("DO");
		int vl = 0;
		do {
			Util.textLn("Digite um valor 5:");
			vl = scan.nextInt();
		}while(vl < 5);
		Util.textEsp(vl);
	}
	
	//Switch
	public static void testSwitch() {
		Util.titulo("SWITCH");
		int vl = 0;
		Util.textLn("Digite um valor:");
		vl = scan.nextInt();
		switch(vl){
		case 1:
		Util.textEsp("um");
		break;
		case 2:
		Util.textEsp("dois");
		break;
		case 3:
		Util.textEsp("tres");
		break;
		case 4:
		Util.textEsp("quatro");
		break;
		case 5:
		Util.textEsp("cinco");
		break;
		default:
			Util.text("Valor maior que cinco");
		}
	}
	
	//Array
	public static void testMultArray() {
		Util.titulo("ARRAY");
		int[] values = new int[5];
		int cont = 0;
		int vl = 0;
		do {
			Util.textLn("Digite um valor :");
			vl = scan.nextInt();
			values[cont] = vl;
			cont++;
		}while(cont < 5);
		for(int i =0 ; i < values.length; i++) {
			Util.text(values[i]);
		}
		Util.textLn("");
		cont--;
		while(cont >= 0 ) {
			Util.text(values[cont]);
			cont--;
		}
		Util.textLn("");
		 // Simultaneously declare and initialize an array of strings
        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        // Iterate through an array
        for(String fruit: fruits) {
        	Util.textLn(fruit);
        }
	}
	
	//Array Matrix
	public static void testArray() {
		Util.titulo("Array Matrix");
		String[][] matrix = new String[3][3];
		matrix[0][0] = "x";matrix[0][1] = "0";matrix[0][2] = "0";
		matrix[1][0] = "0";matrix[1][1] = "X";matrix[1][2] = "0";
		matrix[2][0] = "0";matrix[2][1] = "0";matrix[2][2] = "X";
		for(int x=0;x<matrix.length;x++) {
			for(int y=0;y<matrix.length;y++) {
				Util.text(matrix[x][y]+" ");
			}
			Util.textLn("");
		}
	}
	
	// String
	public static void testString() {
		Util.titulo("String");
        // Inefficient
        String info = "";
        info += "My name is Inefficient.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);
        // More efficient.
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is efficient.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        System.out.println(sb.toString());
        // The same as above, but nicer ....
        StringBuilder s = new StringBuilder();
        s.append("My name is Thesame.")
        .append(" ")
        .append("I am a skydiver.");
        System.out.println(s.toString());
        ///// Formatting ///////////
        // Outputting newlines and tabs
        System.out.print("Here is some text\t That was a tab\n That was a newline.");
        System.out.println(" More text.");
        // Formatting integers
        // %-10d means: output an integer in a space ten characters wide,
        // padding with space and left-aligning (%10d would right-align)
        System.out.printf("Total cost %-10d.; quantity is %10d. \n", 5012,213, 5012,213);
        // Demo-ing integer and string formatting control sequences
        for(int i=0; i<3; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }
        // Formatting floating point value
        // Two decimal place:
        System.out.printf("Total value: %.2f\n", 5.6874);
        // One decimal place, left-aligned in 6-character field:
        System.out.printf("Total value: %-6.1f\n", 343.23423);
        // You can also use the String.format() method if you want to retrieve
        // a formatted string.
        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
        System.out.println(formatted);
        // Use double %% for outputting a % sign.
        System.out.printf("Giving it %d%% is physically impossible. \n", 100);
		System.out.printf("Valor1 = %d.\t Valor2 = %d.\n", 1, 2);
	}
	
	// Classes
	public static void valueObjects() {
		Util.titulo("Classes");
		Util.textLn("Nome da classe: "+Person.classNome);
		Util.textLn(Person.vezes());
		Person pessoa1 =  new Person();
		pessoa1.setName("Nathan");
		pessoa1.setForeName("Soares");
		pessoa1.setAge(36);
		pessoa1.setSex(true);
		pessoa1.setAlt(new Double("1.74"));
		pessoa1.setPes(Double.valueOf("85.2"));
		Person pessoa2 =  new Person("Ariele","Mariz");
		pessoa2.setAge(33);
		pessoa2.setSex(false);
		pessoa2.setAlt(Double.valueOf("1.61"));
		pessoa2.setPes(Double.valueOf("65.1"));
		// Pessoa 1
		Util.text("Nome: "+pessoa1.getName()+" ");
		Util.text("Idade: "+pessoa1.getAge()+" ");
		Util.text("Altura: "+pessoa1.getAlt()+" ");
		Util.text("Peso: "+pessoa1.getPes()+" ");
		Util.textLn((pessoa1.isSex())? "Sexo: Macho": "Sexo: Femea");
		// Pessoa 2
		Util.text("Nome: " + pessoa2.getName()+" ");
		Util.text("Idade: " + pessoa2.getAge()+" ");
		Util.text("Altura: " + pessoa2.getAlt()+" ");
		Util.text("Peso: " + pessoa2.getPes()+" ");
		Util.textLn((pessoa2.isSex())? "Sexo: Macho": "Sexo: Femea");
		Util.textLn(pessoa1.completName());
		pessoa2.resumo();
		Util.textLn(Person.vezes());
	}

	// Cast
	public static void exeCast() {
		Util.titulo("Cast");
		byte vlByte = 127;//-128 to 127
		short vlShort = 32767;//-32,768 to 32,767
		int vlInt = 2147483647;//-2,147,483,648 to 2,147,483,647
		long vlLong = 922337203;//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float vlFloat = 3.40282347E+38F;//3.40282347E+38F
		double vlDouble = 1.79769313486231570E+308;//1.79769313486231570E+308
		// De um valor menor para maior não precisa de cast
		Util.textLn("-Do menor para o maior-");
		Util.textLn("De short para long:");
		long vlLong1=vlShort;
		System.out.println(vlLong1);
		Util.textLn("De byte para int:");
		int vlInt1=vlByte;
		System.out.println(vlInt1);
		Util.textLn("De float para double:");
		double vlDouble1=vlFloat;
		System.out.println(vlDouble1);
		// De um valor maior para menor precisa de cast
		Util.textLn("-Do maior para o menor-");
		Util.textLn("De int para short:");
		short vlShort1=(short) vlInt;
		System.out.println(vlShort1);
		Util.textLn("De long para int:");
		int vlInt2=(int) vlLong;
		System.out.println(vlInt2);
		Util.textLn("De double para float:");
		float vlFloat1=(float) vlDouble;
		System.out.println(vlFloat1);
	}
	
	// Casting
	public static void casting() {
		Util.titulo("Casting");
		Casting.casting();
	}
	
	// Generics
	public static void generics() {
		Util.titulo("Generics");
		Util.textLn("Before Java 5");
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		String fruit = (String) list.get(1);
		Util.textLn(fruit);
		Util.textLn("Modern style");
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		String animal = strings.get(1);
		Util.textLn(animal);
		// There can be more than one type argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Util.textLn("Java 7 style");
		Person pessoa1 =  new Person("Nathan","Soares");
		Person pessoa2 =  new Person("Ariele","Mariz");
		Person pessoa3 =  new Person("Lucca","Soares");
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(pessoa1);
		personList.add(pessoa2);
		personList.add(pessoa3);
		Util.impLista(personList);
		Util.impCollectionPessoa(personList);
	}
	
	// AnonymousClass
	public static void anonymousClass() {
		Util.titulo("AnonymousClass");
		AnonymousClass.anonymous();
	}
	
	// Read File
	public static void readFile() throws FileNotFoundException {
		//File textFile = new File("c:/javaTest.txt");
		File textFile = new File("javaTest.txt");//Se tiver na pasta do projeto
		try {
			Util.titulo("Read File");
			ReadScanner.reading(textFile);
			ReadBufered.reading(textFile);
		}catch(IOException e) {
			Util.textLn("File not find "+textFile.toString());
		}
	}
	
	//Write test
	public static void write() {
		Util.titulo("WriteTest");
		Write.writes("testJava.txt");
	}
	
	// Exeption
	public static void exeptions() {
		Util.titulo("Exeption");
		try {
			String[] array = {"1","2","3"};
			array[3].toString();
			throw new FileNotFoundException("teste");
			//throw new ParseException("Error in command list.", 2);
		}catch(FileNotFoundException e) {
			 //e.printStackTrace();
			 Util.textLn(e.getMessage());
		}catch(IndexOutOfBoundsException e) {
			 Util.textLn(e.getMessage());
		}catch(Exception e) {
			 e.printStackTrace();
		}
	}
	
	//Try with resources
	public static void tryWithResources() {
		Util.titulo("Try-With-Resources");
		TryWithResources.tryResource();
	}
	
	//Test Equals
	public static void testEquals() {
		Util.titulo("Test Equals");
		System.out.println(new Object());
		Person person1 = new Person("Bob","Vader");
		Person person2 = new Person("Bob","Vader");

		System.out.println(person1.equals(person2));
		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1.equals(value2));

		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1.equals(number2));

		String text1 = "Hello";
		String text2 = "Hellodfadf".substring(0, 5);
		Util.textLn(text2);
		System.out.println(text1.equals(text2));
	}
	
	//Inner Class
	public static void innerClass() {
		Util.titulo("InnerClass");
		InnerClass inner = new InnerClass(7);
		InnerClass.Brain brain = inner.new Brain();
		brain.think();		
		InnerClass.Batery batery = new InnerClass.Batery();
		batery.charge();
	}
	
	//ENUM
	public static void enumClass() {
		Util.titulo("ENUM");
        Animal animal = Animal.DOG;
        switch(animal) {
        case CAT:
            System.out.println("Cat");
            break;
        case DOG:
            System.out.println("Dog");
            break;
        case MOUSE:
            break;
        default:
            break;
        }
        System.out.println(Animal.DOG);
        Util.textLn("Enum name as a string: " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.MOUSE.getName());
        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
	}
	
	//Recursivo
	public static void recursivo() {
		Util.titulo("Recursivo");
		Util.textEsp(Recursao.fatorial(5));
	}
	
	//Serialisar
	public static void serialisar() {
		Util.titulo("Serialisar");
		Serializar.writing("person.txt");
		Serializar.Reading("person.txt");
	}
	
	//Serializar array
	public static void serializarArray() {
		Util.titulo("SerializArArray");
		SerializarArray.escreverArray();
		SerializarArray.lerArray();
	}
	
	//References
	public static void references() {
		Util.titulo("References");
		References.references();
	}
	//ArrayList
	public static void arrayList() {
		Util.titulo("ArrayList");
		Collections.arrayList();
	}
	//LinkedList
	public static void linkedList() {
		Util.titulo("LinkedList");
		Collections.linkedList();
	}
	//HashMap
	public static void hashMap() {
		Util.titulo("HashMap");
		Collections.hashMap();
	}
	//LinkedHashMap
	public static void linkedHashMap() {
		Util.titulo("LinkedHashMap");
		Collections.linkedHashMap();
	}
	//TreeMap
	public static void treeMap() {
		Util.titulo("TreeMap");
		Collections.treeMap();
	}
	//HashSet
	public static void hashSet() {
		Util.titulo("HashSet");
		Collections.hashSet();
	}
	
	//Sorting
	public static void sorting() {
		Util.titulo("Sorting");
		Sorting.mistura();
	}
	
	//Comparable
	public static void comparable() {
		Util.titulo("Comparable");
		ComparableTest.start();
	}
	
	//Queues
	public static void queues() {
		Util.titulo("Queues");
		Queues.start();
	}
	
	//Iterator
	public static void iteratorTest() {
		Util.titulo("Iterator");
		IteratorTest.test();
	}
	
	//Iterable
	public static void iterableTest() {
		Util.titulo("Iterable");
		IterableTest iterable = new IterableTest();
		for(String inter: iterable) {
			Util.textLn("Caracteres na pagina: "+inter.length());
		}
	}
	//Collectio Example
	public static void collectioExample() {
		Util.titulo("Collectio Example");
		Collections.exemple();
	}
}