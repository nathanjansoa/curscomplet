package exercicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting implements Comparator<String>  {
	
	public static void mistura() {
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		people.add(new Person(2, "Sue"));
		
		// Sort in order of ID
		java.util.Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if(p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}
		});
		
		for(Person person: people) {
			System.out.println(person.getName());
		}
		
	}
	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	

}
