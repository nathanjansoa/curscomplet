package exercicio;

import java.util.LinkedList;
import java.util.Iterator;

public class IteratorTest {
	public static void test() {
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		
		Iterator<String> percorrer = lista.iterator();
		
		while(percorrer.hasNext()) {
			//No interator hasNext = pega o atual 
			//e vai para o procimo
			String vl = percorrer.next(); 
			Util.textLn(vl);
			if(vl.equals("dos")) {
				percorrer.remove();
			}
		}
		
		for(String vl: lista) {
			Util.textLn(vl);
		}
	}
}
