package exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {
	//////////// List ////////////////
	public static void arrayList(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//Add
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		Util.textLn(">>Get<<");
		Util.textEsp(numbers.get(1));
		Util.textLn(">>For normal<<");
		for(int i = 0; i < numbers.size();i++) {
			Util.textEsp(numbers.get(i));
		}
		//Remove arrays primeiro(muito lento) tem que mover todos os itens do array
		numbers.remove(0);
		//Remove arrays ultimo
		numbers.remove(numbers.size()-1);
		Util.textLn(">>For especial<<");
		for(int i:numbers) {
			Util.textEsp(i);
		}
		Util.textLn(">>Adicionando Substituindo<<");
		//ArrayList herda de List
		List<Integer> lista = new ArrayList<Integer>();
		for(int i = 0; i < 1E1; i++) {
			lista.add(i);
        }
		//Altera um elemento no arraylist
		System.out.println("Tamanho antes set:"+lista.size());
		System.out.println("valor antes:"+lista.get(3));
		lista.set(3, 123);
		System.out.println("valor depois:"+lista.get(3));
		System.out.println("Tamanho depois set:"+lista.size());
		//Adiciona um elemento no arraylist
		System.out.println("Tamanho antes add:"+lista.size());
		System.out.println("valor antes:"+lista.get(3));
		lista.add(3, 456);
		System.out.println("valor depois:"+lista.get(3));
		System.out.println("valor procimo:"+lista.get(4));
		System.out.println("Tamanho depois set:"+lista.size());
	}
	
	public static void linkedList() {
		/*
         * ArrayLists manage arrays internally.
         * [0][1][2][3][4][5] ....
         */
        List<Integer> arrayList = new ArrayList<Integer>();
        /*
         * LinkedLists consists of elements where each element
         * has a reference to the previous and next element
         * [0]->[1]->[2] ....
         */
        List<Integer> linkedList = new LinkedList<Integer>();
        //Teste de tempo entre array e linked inserindo no meio e no fim.
        doTimeListEnd("ArrayList", arrayList);
        doTimeListEnd("LinkedList" , linkedList);
        doTimeListMid("ArrayList", arrayList);
        doTimeListMid("LinkedList" , linkedList);
        //Adicionando no no fim
        int valor = 123;
        linkedList.add(valor);
        //Adicionando no meio
        System.out.println("O antes "+linkedList.get(23));
        linkedList.add(23, 14);
        System.out.println("O depois "+linkedList.get(23));
        System.out.println("Existe o valor "+valor+" : "+linkedList.contains(123));
        System.out.println("Tamanho da lista "+linkedList.size());
        System.out.println("O ultimo "+linkedList.get(linkedList.size()-1));
	}
	
	// Comparação percorrento o List colocando no final
	public static void doTimeListEnd(String type, List<Integer> list) {
		// 1e5 = 10 a 5 potencia 100000, vai fazer cem mil vezes.
		for (int i = 0; i < 4E4; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		// Add items at end of list
		for (int i = 0; i < 4E4; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		Util.text("Tempo corrido: " + (end - start) + " ms for " + type + " inseridos no fim. \n");
	}

	// Comparação percorrento o List colocando no meio
	public static void doTimeListMid(String type, List<Integer> list) {
		for (int i = 0; i < 4E4; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		// Add items elsewhere in list
		for (int i = 0; i < 4E4; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		Util.text("Tempo corrido: " + (end - start) + " ms for " + type + " inseridos no meio. \n");
	}
	//////////// MAP ////////////////
	public static void hashMap() {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		testMap(hashMap);
		doTimeMapEnd("hashMap", hashMap);
	}
	
	public static void linkedHashMap() {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		testMap(linkedHashMap);
		doTimeMapEnd("linkedHashMap", linkedHashMap);
	}
	
	public static void treeMap() {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		testMap(treeMap);
		doTimeMapEnd("treeMap", treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(6, "Seis");
        map.put(4, "Four");
        map.put(2, "Two");

		// For especial
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println("Key: "+key + " = Valor:" + value);
		}
	}
	// Comparação percorrento o Map colocando no final
	public static void doTimeMapEnd(String type, Map<Integer,String> map) {
		// 1e5 = 10 a 5 potencia 100000, vai fazer cem mil vezes.
		for (int i = 0; i < 5E4; i++) {
			map.put(i, "txt");
		}
		long start = System.currentTimeMillis();
		// Add items at end of list
		for (int i = 0; i < 5E4; i++) {
			map.put(i, "txt");
		}
		long end = System.currentTimeMillis();
		Util.text("Tempo corrido: " + (end - start) + " ms for " + type + " inseridos no fim. \n");
	}
	//////////// Set ////////////////
	public static void hashSet() {
		// HashSet does not retain order.
		Set<String> set = new HashSet<String>();
		set.add("5");
		set.add("8");
		set.add("2");
		set.add("6");
		set.add("4");
		if (set.isEmpty()) {
            System.out.println("Set is empty after adding (no!)");
        }
        // Adding duplicate items does nothing.
		set.add("mouse");
		System.out.println(set);
        // ///////// Iteration ////////////////
        for (String element : set) {
            System.out.println(element);
        }
	}
	
	public static void exemple() {
		String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

		String[][] drivers = { 
				{ "Fred", "Sue", "Pete" }, 
				{ "Sue", "Richard", "Bob", "Fred" },
				{ "Pete", "Mary", "Bob" }, };
		Map<String,Set<String>> veiculos = new HashMap<>(); 
		for(int x = 0; x<vehicles.length;x++) {
			Util.textLn("Incluindo motoristas para: "+vehicles[x]);
			for(int y = 0; y<drivers.length;y++) {
				Set motoristas = new HashSet();
				motoristas.add(drivers[x]);
				veiculos.put(vehicles[x], motoristas);
			}
		}
		for(String i :veiculos.keySet()) {
			System.out.println(veiculos.get(i));
		}
		System.out.println(veiculos.get("helicopter").toString());
	}
	
	public static void consider() {
        /* 
         * Consider:
         * 1. what you need the collection to do
         * 2. are you using the fastest collection for your purposes
         * (think about insertion/deletion, retrieval and traversal
         */
        
        //////////////// LISTS ///////////////////////////////////
        
        // Store lists of objects
        // Duplicates are allowed
        // Objects remain in order
        // Elements are indexed via an integer
        // cf. shopping list
        // Checking for particular item in list is slow
        // Looking an item up by index is fast
        // Iterating through lists is relatively fast
        // Note: you can sort lists if you want to.
        
        // If you only add or remove items at end of list, use ArrayList.
        List<String> list1 = new ArrayList<String>();
        
        // Removing or adding items elsewhere in the list?
        List<String> list2 = new LinkedList<String>();
        
        ////////////////SETS ///////////////////////////////////
        
        // Only store unique values
        // Great for removing duplicates
        // Not indexed, unlike lists
        // Very fast to check if a particular object exists
        // If you want to use your own objects, you must implement hashCode() and equals().
        
        // Order is unimportant and OK if it changes?
        // HashSet is not ordered.
        Set<String> set1 = new HashSet<String>();
        
        // Sorted in natural order? Use TreeSet - must implement Comparable for custom types
        // (1,2,3 ..., a,b,c.... etc)
        Set<String> set2 = new TreeSet<String>();
        
        // Elements remain in order they were added
        Set<String> set3 = new LinkedHashSet<String>();
        
        ////////////////MAPS ///////////////////////////////////
        
        // Key value pairs.
        // Like lookup tables
        // Retrieving a value by key is fast
        // Iterating over map values is very slow
        // Maps not really optimised for iteration
        // If you want to use your own objects as keys, you must implement hashCode() and equals().
        
        // Keys not in any particular order, and order liable to change.
        Map<String, String> map1 = new HashMap<String, String>();
        
        // Keys sorted in natural order - must implement Comparable for custom types
        Map<String, String> map2 = new TreeMap<String, String>();
        
        // Keys remain in order added 
        Map<String, String> map3 = new LinkedHashMap<String, String>();
        
        // There are also the SortedSet and SortedMap interfaces.
    }
}