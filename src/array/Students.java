package array;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students= {"Alice","Bob","Charlie","David","Eva"};
		int[][] mark= {{80,75,90},{85,70,95},{90,80,85},{75,85,90},{95,90,80}};
		int[] sum=new int[20];
		int k=0;
		for(int i=0;i<mark.length;i++)
		{
			int total=0;
			for(int j=0;j<mark[i].length;j++)
			{
				//System.out.println(mark[i][j]);
				total=total + mark[i][j];
			
				
			}
			sum[i]=total;
			System.out.println(sum[i]);
		}
		for( k=0;k<sum.length;k++)
		{
			int temp=0;
			if(sum[k]<sum[k+1])
			{
				temp=sum[k];
				sum[k]=sum[k+1];
				sum[k+1]=temp;
				
			}
		}
		System.out.println(sum[k]);	
		
		}
			
		

}
