package inheritense;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Claim p1=new Claim(1,751,"Blesson",123,"HDFC",6510,"Approved");
		System.out.println(p1.getId());
		System.out.println(p1.getNum());
		System.out.println(p1.getName());
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println(p1.getPamount());
		System.out.println(p1.getClaim());
	}

}