package javaexamples;

public class Arraymerge {
	public static void main(String[] args)
	{
		int[] a= {3,2,30};
		int[] b= {4,15,66,7};
		int[] c= new int[a.length + b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index]=a[i];
			index++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[index]=b[i];
			index++;
		}
		int temp;
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++) 
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
									
				}
				

			}
			System.out.println(c[i]);		
			
		}

	}
}
		