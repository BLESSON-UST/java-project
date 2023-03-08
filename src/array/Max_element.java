package array;

public class Max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,3,8,1,7,2};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	

	}

}
