package array;
import java.util.*;
public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
				a[i][j]=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
			{	System.out.print(a[i][j]);}
		System.out.println("");}

	}

}
