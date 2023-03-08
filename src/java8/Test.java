package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> ed= new ArrayList<Employee>();
		ed.add(new Employee("1","Anirudh",40000));
		ed.add(new Employee("2","Cristo",60000));
		ed.add(new Employee("3","Jenson",200000));
		ed.add(new Employee("4","Blesson",23654));
	
		//Comparator.comparing(Employee::getEsalary);
//		Stream<Employee> emp= ed.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed());
//		System.out.println("Between 50K and 1L");
//		ed.stream().filter(p->p.getEsalary()>50000 && p.getEsalary()<100000).forEach(p->System.out.println(p.ename + p.esalary));
//		System.out.println("greater than 1L");
//		ed.stream().filter(p->p.esalary>100000).forEach(p->System.out.println(p.ename + p.esalary));
//	    List<Employee> ur=ed.sort(Comparator.comparing(Employee::esalary).thencomparing(Employee::ename));
//		for(Employee i:ed)
//		{
//			System.out.println(i.ename + i.esalary);
//		}
//		System.out.println(emp);
//		List<Employee> e=ed.stream().sorted(Comparator.comparing(Employee::getEsalary).toString());
		System.out.println(ed);

	}

}
