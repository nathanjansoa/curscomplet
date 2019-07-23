package exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadScanner {
	public static void reading(File textFile) throws FileNotFoundException {
		Util.textLn(">Scanner<");
		Scanner scan = new Scanner(textFile);
		int count = 1;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if(scan.hasNextInt()) {
				Util.textLn(count + ": Read value: " + line /*scan.nextInt()*/);
			}else {
				Util.textLn(count + ": " + line);
			}
			count++;
		}
		scan.close();
	}
}