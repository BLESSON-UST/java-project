package java8;
import java.util.*;
import java.util.stream.Collectors;
public class Jane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Article");
		String s=sc.nextLine();
		sc.close();
		 s = s.replaceAll("[-+.^:?,!;]","");
		List<String> s1=new ArrayList<String>(Arrays.asList(s.split(" ")));		
		List<String> s3=s1.stream().map(s2->s2.toLowerCase()).sorted().distinct().collect(Collectors.toList());
		System.out.println("total words: "+s1.size());
		System.out.println("unique words: "+s3.size());
		System.out.println("The words are");
		for(int i=0;i<s3.size();i++)
		{
			System.out.println(s3.get(i));
		}
		
	}

}
