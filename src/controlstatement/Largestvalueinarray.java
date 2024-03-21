package controlstatement;

import java.util.Scanner;

public class Largestvalueinarray {

	public static void main(String[] args) {
		
		
		int [][]ar=new int[3][3];
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		int l=0;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				ar[i][j]=sc.nextInt();
				
				if(ar[i][j]>l)
				{
					l=ar[i][j];
					
				}
		}
		}
		System.out.println("largest number="+l);
	
for(int v1[]:ar)
{
	for (int v2:v1)
	{
		System.out.print(v2+"  ");
	}
	System.out.println();
	}
	}

}
