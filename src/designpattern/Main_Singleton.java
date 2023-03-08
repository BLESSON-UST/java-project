package designpattern;

public class Main_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		if(instance1==instance2)
		{
			System.out.println("same instance");
		}
		else
		{
			System.out.println("diff instance");
		}
		

	}

}
