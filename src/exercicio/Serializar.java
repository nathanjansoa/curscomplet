package exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {
	public static void writing(String name) {
		Util.textLn("Writing objects...");
		Person mike = new Person("Mike", "");
		Person sue = new Person("Sue", "");
		System.out.println(mike);
		System.out.println(sue);
		try (FileOutputStream fs = new FileOutputStream(name)) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mike);
			os.writeObject(sue);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void Reading(String name) {
		Util.textLn("Reading objects...");
        try(FileInputStream fi = new FileInputStream(name)) {
            ObjectInputStream os = new ObjectInputStream(fi);
            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();
            os.close();
            System.out.println(person1);
            System.out.println(person2);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}