package java8;

import java.util.stream.Collectors;
import java.util.*;

public class Main_Customers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		List<Customers> ed= new ArrayList<Customers>();
		ed.add(new Customers(1, "Anirudh", 1234, "anikuttan@gmail.com", "Piravom"));
		ed.add(new Customers(2, "Blesson", 5678, "blesson@gmail.com", "Kottayam"));
		ed.add(new Customers(3, "Cristo", 8765, "cristho@gmail.com", "Ayarkunnam"));
		ed.add(new Customers(4, "Jenson", 4321, "jensaappi@gmail.com", "Thiruvalla"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the registerd ID");
		int n=sc.nextInt();
		List<Customers> c5=ed.stream().filter(t->t.getRid()==n).collect(Collectors.toList());
		System.out.println(c5);
		
	}

}
