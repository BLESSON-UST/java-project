package file;
import java.io.*;
public class File_exw {
	public static void main(String[] args) {
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\sample1.txt");
			String s="Hello Moto";
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
