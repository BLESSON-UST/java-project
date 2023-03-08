/**
 * 
 */
package hashmapexamples;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer,Employees> hmap=new HashMap();
		Employees e1=new Employees("Anirudh",22,"Development");
		Employees e2=new Employees("Blesson",25,"Development");
		Employees e3=new Employees("Cristo",22,"Development");
		Employees e4=new Employees("Jenson",22,"Development");
		hmap.put(1,e1 );
		hmap.put(2,e2);
		hmap.put(3,e3);
		hmap.put(4,e4);
		//System.out.println(hmap);
		
		 int s=hmap.hashCode();
		System.out.println(s);
		 int p=hmap.hashCode();
		System.out.println(p);
		
	}

}



