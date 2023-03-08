package java8;
import java.util.*;
import java.util.stream.Collectors;
public class Square_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n= Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> e=n.stream().filter(num->num % 2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(e);
	
		

	}

}
