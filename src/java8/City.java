package java8;
import java.util.*;
import java.util.stream.Collectors;
public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c= Arrays.asList("KTYM","ERN","tVC","Tvl","KNR","TMB");
		List<String> t=c.stream().map(s->s.toLowerCase()).filter(s->s.startsWith("t")).collect(Collectors.toList());
		System.out.println(t);

	}

}
