package controlstatement;

import java.util.Scanner;

public class Repeatedletter {

	private static char String;

	public static void main(String[] args) {
		String s="malayalam";
		int c=0;
	
		char[]ch=s.toCharArray();
		int count=s.length();
		
		for(int i=0;i<count;i++)
		{
			c=1;
			for(int j=i+1;j<count;j++)
			{
					if(ch[i] == ch[j] )
					{
						c++;
					ch[j]='0';
				//System.out.println("repeated charecters="+ch[j]);
							}
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]);
				System.out.println("repeaters="+c);
			}
		}

		
	}	
		
	

	
}
