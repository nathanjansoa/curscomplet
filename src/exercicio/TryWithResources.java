package exercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void tryResource() {

		try (Temp temp = new Temp()) {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			Util.textLn("File not find "+e.toString());
		}
		
		App2.app2();

	}

}

class Temp implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("oh no!");
	}

}

class App2 {

	public static void app2() {
		File file = new File("test.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file>> " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

}