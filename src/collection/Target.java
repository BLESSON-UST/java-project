package collection;

import java.util.*;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("enter the range");
		int n=sc.nextInt();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			a.add(i,sc.nextInt());
			
		}
		//for(int i=0;i<n;i++)
	//	{
	//		System.out.println(a.get(i));
	//	}
		
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a.get(j)+a.get(k)==25)
				{
					System.out.println(a.get(j) + "and" + a.get(k));
					//System.out.println( a.get(k));
				
				}
			}
		}
			
	}

}
