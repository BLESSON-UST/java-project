package collection;

import java.util.*;
import java.util.HashSet;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int flag=0;
		int i=0;
		int j=0;
		HashSet<Integer> h = new HashSet<Integer>();
		System.out.println("enter the range");
		int n=sc.nextInt();
		System.out.println("enter the values of 1st hash set");
		for( i=0;i<(n);i++)
		{
			h.add(sc.nextInt());
		}
		HashSet<Integer> h2 = new HashSet<Integer>();
		System.out.println("enter the values of 2nd hash set");
		for( i=0;i<(n);i++)
		{
			h2.add(sc.nextInt());
		}
		
//		h.retainAll(h2);
		
	
	
		for(Integer a:h)
		{
			if(h2.contains(a))
			{
				 flag=1;
				 System.out.println(a);
			}
			
		}
		if(flag==1)
		{
			System.out.println("common elements" );
			
		}
		else
		{
			System.out.println("no common elements");
		}
	}
}
	