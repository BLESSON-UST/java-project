package java8;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Newcity_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter min budget");
		int bmin=sc.nextInt();
		System.out.println("Enter max budget");
		int bmax=sc.nextInt();
		List<Newcity> h=new ArrayList<Newcity>();
		List<Newcity> h5=new ArrayList<Newcity>();
		h.add(new Newcity(1,"abc",1500));
		h.add(new Newcity(2,"def",1800));
		h.add(new Newcity(3,"ghi",2500));
		h.add(new Newcity(4,"jkl",2800));
		h.add(new Newcity(5,"mno",3500));
		h.add(new Newcity(6,"pqr",3800));
		List<Newcity> h1=h.stream()
				.filter(t->((t.getHrent()>=bmin)&&(t.getHrent()<=bmax))).collect(Collectors.toList());
		System.out.println(h1);
		System.out.println("Select the hotel id");
		int h3=sc.nextInt();
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter id no:");
		String num=sc.next();
		List<String> c = Arrays.asList(n,num);
		
		List<Newcity> h4=h.stream().filter(t1->t1.getHid()==h3).collect(Collectors.toList());
//		h5=Stream.concat(c.stream(),h4.stream()).collect(Collectors.toList());

		System.out.println("Hi " + n +" with id num "+ num + " you have been  booked at " + h4);
		
		
		

	}

}
