package exercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Persons implements Comparable<Persons> {
    private String name;
    
    public Persons(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Persons other = (Persons) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Persons person) {
        int len1 = name.length();
        int len2 = person.name.length();
        
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(person.name);
        }
    }
}

public class ComparableTest {

    public static void start() {
        List<Persons> list = new ArrayList<Persons>();
        SortedSet<Persons> set = new TreeSet<Persons>();
        //O set organiza na hora que insere já o liste precisa do sort
        addElements(list);
        addElements(set);
        Collections.sort(list);
        showElements(list);
        System.out.println();
        showElements(set);
        list.clear();
        set.clear();
    }
    
    private static void addElements(Collection<Persons> col) {
        col.add(new Persons("Nathan"));
        col.add(new Persons("Xavie"));
        col.add(new Persons("Thanos"));
        col.add(new Persons("Clare"));
        col.add(new Persons("Ana"));
    }
    
    private static void showElements(Collection<Persons> col) {
        for(Persons element: col) {
            System.out.println(element);
        }
    }

}