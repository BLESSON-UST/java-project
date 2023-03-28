package javaexamples;

public class Maxarray {
	public static void main(String[] args)
	{
		int[] a= {32,54,100,9};
		 
		    int max = a[0]; 
		    for (int i = 1; i < a.length; i++) {
		      if (a[i] > max) {
		        max = a[i];
		      }
		    }
		    
		    System.out.println("The maximum number in the array is: " + max);
	}
}
