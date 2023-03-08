package collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a =new ArrayList<String>();
		a.add("Blesson");
		a.add("Cristo");
		a.add("Anirudh");
		a.add("Jenson");
		System.out.println(a);
		System.out.println(a.get(0)); 
		a.remove(3);
		System.out.println(a);
		a.add(3,"Kevin");
		System.out.println(a);
		a.add("Swetha");
		System.out.println(a);
		a.add(2,"Aadil");
		System.out.println(a);
		a.add(1,"Jenson");
		System.out.println(a);
		a.sort(null);
		System.out.println(a);
		
	}

}
