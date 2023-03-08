package collection;

import java.util.*;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=5;
	/*	a.add("Anirudh");
		a.add(,"Blesson");
		a.add("Cristo");
		a.add("Jenson"); */
		for(int i=0;i<n;i++)
		{
			a.add(i,sc.next());
		}
		Iterator i= a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		

	}

}
