package controlstatement;

import java.util.Scanner;

public class Multidiamarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]ar=new int[3][2];
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=1; j++)
			{
				ar[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
