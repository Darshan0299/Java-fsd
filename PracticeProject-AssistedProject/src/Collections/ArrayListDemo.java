package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		
		
		cities.add("CBE");
		cities.add("Chennnai");
		cities.add(2, "madurai"); 
		cities.add("Pune");
		
		System.out.println(cities.size()); 
		
		for(String t: cities)
		{
			System.out.println(t);
		}

	}

}
