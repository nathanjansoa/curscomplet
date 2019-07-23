package exercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void writes(String text) {
		File file = new File(text);
		try (BufferedWriter buff = new BufferedWriter(new FileWriter(file))) {
			for (int i = 1; i <= 10; i++) {
				buff.write("Essa foi a linha: "+i);
				buff.newLine();
			}
			buff.write(text,4, 4);
		} catch (IOException e) {
			Util.textLn("Unable to read file " + file.toString());
		}
		try {
			ReadBufered.reading(file);
		}catch(IOException e) {
			Util.textLn("File not find "+file.toString());
		}
	}

}
