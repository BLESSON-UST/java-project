package array;
import java.util.*;
public class Positive_Negative {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a = {4,-4,6,8,-9,0,4,-7,56};
		int[] p = new int[10];
		int[] n = new int[10];
		int pc=0;
		int nc=0;
		int j=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				p[j]=a[i];
				j++;
				pc++;
			}
			if(a[i]<0)
			{
				n[k]=a[i];
				k++;
				nc++;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(p[i]);	
		}
		System.out.println("\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(n[i]);		
		}
		
		System.out.println("\n");
		System.out.println("total no: of positive elements is " + pc);
		System.out.println("total no: of negative elements is " + nc);
	
		
	}

}
