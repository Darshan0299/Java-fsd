package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("CBE");
		cities.add("Chennnai");
		cities.add(2, "madurai"); 
		cities.add("Pune");
		
		System.out.println(cities.size()); // it will print the no of elements in the list
			
		Iterator itr =	cities.iterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		System .out.println(cities.get(1));
	
		System .out.println(cities.contains("Hydrabad"));

	}

}
