package java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Freequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s= Arrays.asList("TVM","KTYM","PGT","ERS","KTYM","TVM");
		//List<Boolean> c=s.stream().filter(s1->s1.contentEquals(s1)).map(s1->s1.contentEquals(s1)).collect(Collectors.toList());
		Map<String,Long> c=s.stream().map(s1->s1.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(c);

	}

}
