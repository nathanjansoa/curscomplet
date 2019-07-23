package exercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBufered {
	public static void reading(File textFile) throws IOException {
		Util.textLn(">Bufered<");
		FileReader arquivo = new FileReader(textFile);
		BufferedReader buff = new BufferedReader(arquivo);
		String line;
		int count = 1;
		while((line = buff.readLine()) != null){
			Util.textLn(count+": "+line);
			count++;
		}
		buff.close();
	}
}