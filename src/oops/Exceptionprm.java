package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprm {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream ob=new FileInputStream("E://Book1.xlsx");
		
		
		
		try {
		int a=20,b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(Exception e) 
		{
			System.out.println("arithmatic exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("hello");
		
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		finally 
		{
		System.out.println("haiii");
		}
	}
		

}
