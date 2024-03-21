package controlstatement;

import java.util.Scanner;

public class Multidiamforeachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ar= new int[3][3];
		System.out.println("enter the numbers");
		Scanner sc= new Scanner(System.in);
		int a=0,b=0,c=0;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				ar[i][j]=sc.nextInt();			
				
		if (ar[i][j]>0)
		{
			a++;
			
		}
		else if (ar[i][j]<0)
		{
			b++;
		}
		else 
		{
			c++;
		}
			}
		}
		System.out.println("number of positives="+a);
		System.out.println("number of negative="+b);
		System.out.println("number of zero="+c);
		
		for(int v1[]:ar)
		{
			for(int v2:v1)
			{
				System.out.print(v2+"   ");
			}
				System.out.println();
		}
	}
}
			
	

