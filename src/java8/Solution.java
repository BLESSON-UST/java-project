package java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
	
		public static void main(String[] args) {
			Employee e1=new Employee("1","Anirudh",40000);
			Employee e2=new Employee("2","Cristo",60000);
			Employee e3=new Employee("3","Jenson",200000);
			Employee e4=new Employee("4","Blesson",23654);
			List<Employee> list=Arrays.asList(e1,e2,e3,e4);
			List<Employee> lis = list.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed())
					.peek(k->{
					if((k.getEsalary()>=50000)&&(k.getEsalary()<100000))
						k.setEsalary(k.getEsalary()+(0.1)*k.getEsalary());
					else if(k.getEsalary()>=100000)
						k.setEsalary(k.getEsalary()+(0.05)*k.getEsalary());}
				      ).toList();
					
			
						 
			System.out.println(lis);
			
		}

	}


