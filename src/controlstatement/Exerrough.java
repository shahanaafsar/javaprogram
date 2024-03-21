package controlstatement;

import java.util.Scanner;

public class Exerrough {

	public static void main(String[] args) {
		
	//37	
		String st= "hello 123  @#er trivandrum";
		char[]letters=st.toCharArray();
		System.out.println(st);
		int a=0,b=0,c=0,d=0;
		for(int i=0;i<=letters.length-1;i++)
		{
			if(Character.isAlphabetic(letters[i]))
			{
				a++;
			}
			else if(Character.isDigit(letters[i])) 
			{
				b++;
			}
			else if(Character.isSpaceChar(letters[i]))
			{
				c++;
			}
			else
			{
				d++;
			}
			
		}	
		System.out.println(+a);	
		System.out.println(+b);
		System.out.println(+c);
		System.out.println(+d);
	}

}
