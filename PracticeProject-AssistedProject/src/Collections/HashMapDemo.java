package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> td = new HashMap<>();
		td.put(123, "Anil");
		td.put(1234, "sab");
		td.put(1235, "Anilk");
		td.put(12346, "sabi");
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey() + " - "+ m.getValue());
		}
		
		System.out.println(td.containsKey(1234));
		
		
		System.out.println(td.remove(1234));
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey() + " - "+ m.getValue());
		}


	}

}
