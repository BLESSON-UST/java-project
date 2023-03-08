package array;
import java.util.*;
public class Luckynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		int[] a= new int[4];
		int i=0;
		int flag=0;
		
		;
		int r=0;
		while(n>0)
		{
			 r=n%10;
			n=n/10;
			a[i]=r;
			i++;
			
		}
	//	for(i=0;i<4;i++)
		//{
			//System.out.println(a[i]);
		//}
		
		for(i=0;i<4;i++)
		{
			if(a[i]==3)
			{
				flag++;
				for(i=0;i<4;i++)
				{
					if(a[i]==6)
					{
						flag++;
						for(i=0;i<4;i++)
						{
							if(a[i]==9)
							{
								flag++;
								
								
							}
						}
					}
				}
				
			}
			else
			{
				flag=1;
			}
		}
		
		
		if(flag>=4)
		{
			System.out.println("magic number");
			
		}
		else
		{
			System.out.println("not a magic number");
		}
		
	}

}
