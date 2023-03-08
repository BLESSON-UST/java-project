package collection;

import java.util.Scanner;

public class Pascals_triangle {
	public int fact(int i)
	{
		if(i==0)
		{
			return 1;
		}
		else
		{
			return i*fact(i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pascals_triangle a=new Pascals_triangle();
	    
		
		

	}

}
