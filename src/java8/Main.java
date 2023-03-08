package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pl= new ArrayList<Product>();
		pl.add(new Product(1,"Laptop",50000));
		pl.add(new Product(2,"TV",20000));
		pl.add(new Product(3,"Oven",3000));
		pl.add(new Product(4,"Iron box",1000));
		//List<String>pr=pl.stream().filter(p->p.pprize>10000).map(s->s.pname).collect(Collectors.toList());
		//List<Integer>prr=pl.stream().filter(p->p.pprize>10000).map(p->p.pprize).collect(Collectors.toList());
		pl.stream().filter(p->p.pprize>10000).forEach(p->System.out.println(p.pname + p.pprize));
		//System.out.println(pr + prr);
		
		
		

	}

}
