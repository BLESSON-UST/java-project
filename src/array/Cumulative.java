package array;
import java.util.*;
public class Cumulative {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a=new int[10];
	int[] c=new int[10];
	int s=0;
	System.out.println("enter the size of array");
	int n= sc.nextInt();
	System.out.println("Enter the values of array");
	for(int i=0;i<n;i++) 
	{
		a[i]=sc.nextInt();
		
	}
	for(int j=0;j<n;j++)
	{
		s=s+a[j];
		c[j]=s;
	}
	for(int j=0;j<n;j++)
	{
		System.out.println(c[j]);
	}
}
}