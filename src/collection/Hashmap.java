package collection;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap=new HashMap();
		hmap.put("Blesson",25);
		hmap.put("Adarsh", 26);
		hmap.put("Sreejith", 27);
		System.out.println("The age of adarsh is " + hmap.get("Adarsh"));
		System.out.println(hmap);
		hmap.remove("Blesson");
		System.out.println("The updated hash map is "+hmap);
		for(Map.Entry<String,Integer> m :hmap.entrySet());
		{
			
		}
		
		
		

	}

}
