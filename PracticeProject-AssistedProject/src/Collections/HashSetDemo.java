package Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> cities = new HashSet<>();
		
		cities .add("London");
		cities.add("New York");
		cities .add("Chennai");
		cities.add("Coimbatore");
		
		for(String t : cities)
		{
			System.out.println(t);
		}
		
		System.out.println(cities.size());
		
		System.out.println(cities.contains("Tokyo"));
		

	}

}
