package array;
import java.util.*;
public class Paleandrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);
		if(s.equals(r))
		{
			System.out.println(s+" is paleandrom");
		}
		else
		{
			System.out.println(s+" is not a paleandrom");
		}
	}

}
