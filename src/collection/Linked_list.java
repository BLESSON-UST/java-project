package collection;
import java.util.*;
public class Linked_list {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int mid=0;
		LinkedList <Integer> a = new LinkedList<Integer>();
		System.out.println("enter the range");
		int n=sc.nextInt();
		System.out.println("enter the values");
		for(int i=0;i<(n);i++)
		{
			a.add(sc.nextInt());
		}
//		a.add(100);
//		a.add(200);
//		a.add(300);
//		a.add(400);
//		System.out.println(a);
//		Iterator i=a.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		mid=n/2;
		if(mid%2==0)
		{
			
			System.out.println(a.get(mid));
			a.remove(mid);
			System.out.println(a);
		}
		else
		{
			System.out.println(a.get(mid-1) + "and" + a.get(mid));
			a.remove(mid-1);
			a.remove(mid);
			System.out.println(a);
		}
		
		
			
				
		
		
		
	}

}
