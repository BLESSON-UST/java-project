package javaexamples;

import java.util.*;
public class Anangram {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.next();
		System.out.println("Enter second String");
		String s2=sc.next();
		if(isanagram(s1,s2))
		{
			System.out.println("Strings " + s1 + "and " + s2+ " are anagrams"  );
		}
		else
		{
			System.out.println("Not anagrams");
		}
		
	}

	private static boolean isanagram(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length())
		{
			return false;
		}
		int[] charCount = new int[256];
		for(int i=0;i<s1.length();i++)
		{
			charCount[s1.charAt(i)]++;
			charCount[s2.charAt(i)]--;
		}
		for(int i=0;i<charCount.length;i++)
		{
			if(charCount[i]!=0)
			{
				return false;
			}
		}
		
		return true;
	}

	
}
