package exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializarArray implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12L;

	public static void escreverArray(){
		Util.textLn(">escrevendo Array<");
		Person[] pessoas = {new Person("Mateus", "Soares"),new Person("Lucas","Silva"),new Person("Joao", "Meneses")};
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(pessoas));
		try(FileOutputStream fs = new FileOutputStream("pessoas.ser")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			// Write entire array
			os.writeObject(pessoas);
			// Write arraylist
			os.writeObject(peopleList);
			// Write objects one by one
            os.writeInt(peopleList.size());
            for(Person person: peopleList) {
                os.writeObject(person);
            }
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void lerArray(){
		Util.textLn(">lendo Array<");
		try(FileInputStream fs = new FileInputStream("pessoas.ser")){
			ObjectInputStream os = new ObjectInputStream(fs);
			// Read entire array
			Person[] pessoas = (Person[])os.readObject();
			// Read entire arraylist
            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
			for(Person person:pessoas) {
				Util.text(person.completName());
			}
			Util.textLn("");
			Util.textLn("ListaPessoa");
			Util.impCollectionPessoa(peopleList);
			// Read objects one by one.
            int num = os.readInt();
            Util.textLn("Read objects one by one");
            for(int i=0; i<num; i++) {
                Person person = (Person)os.readObject();
                Util.text(person.completName());
            }
            Util.textLn(".");
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
}
