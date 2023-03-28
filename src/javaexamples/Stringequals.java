package javaexamples;

public class Stringequals {
	
	    public static void main(String[] args) {
	        String str1 = "bLeSsOn";
	        String str2 = "Blesson";
	        str1=str1.toLowerCase();
	        str2=str2.toLowerCase();
	       int flag=1;
	       if(str1.length()==str2.length())
	       {
	    	   for(int i=0;i<str1.length();i++)
	    	   {
	    		   if(str1.charAt(i)!=str2.charAt(i))
	    		   {
	    			   flag=0;
	    			   break;
	    		   }
	    	   }
	       
	       }  
	    else
	    {
	        flag=0;
	       
	    }
	  if(flag==1)
	  {
		  System.out.println("equals");
	  }
	  else
	  {
		  System.out.println("not equal");
	  }
	}
}
	    


