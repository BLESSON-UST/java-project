package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mess_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Food> menu=new ArrayList<Food>();
		menu.add(new Food(1,"Veg meal",80));
		menu.add(new Food(2,"Fish Curry meal",120));
		menu.add(new Food(3,"Chappathi + veg curry",40));
		menu.add(new Food(4,"Chappathi + chicken curry",100));
		menu.add(new Food(5,"Veg Fried rice",60));
		menu.add(new Food(6,"Chicken Fried rice",150));
		//System.out.println(menu);
		for(Food i:menu)
		{
			System.out.println(i.getFid() + " " + i.getFood() + " " + i.getPrize());
		}
		System.out.println("Enter Name");
		String ename=sc.next();
		System.out.println("Enter Uid");
		int uid=sc.nextInt();
		List<Emp> emp=new ArrayList<Emp>();
		emp.add(new Emp(ename,uid));
//		System.out.println(emp);
		System.out.println("Enter the food id you need");
		int n=sc.nextInt();
//		System.out.println("Do you want more item?");
//		System.out.println("y" + "or" + "n");
//		String ch=sc.next();
		List<Food>f=menu.stream().filter(t->t.getFid()==n).toList();
		
		
//		System.out.println(f);
		
		
//		emp.add(new Emp("Anirudh",245099 ));
//		emp.add(new Emp("Blesson",245045 ));
//		emp.add(new Emp("Cristo",245052 ));
//		emp.add(new Emp("Jenson",245048 ));
//		System.out.println("enter uid");
//		int u=sc.nextInt();
//		List<Emp>e=emp.stream().filter(t1->t1.getUid()==u).toList();
		//System.out.println(e);
		//System.out.print(e + " "+ f);
		
		List<String> combinedList = (List<String>) Stream.of(emp, f)
		        .flatMap(x -> x.stream())
		        .collect(Collectors.toList());

		System.out.println(combinedList);
		
		
		


	}

}

