package controlstatement;

import java.util.Scanner;

public class Positivenegativearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]ar= new int[3][3];
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for (int v1[]:ar)
		{
			for(int v2:v1)
			{
				System.out.print(v2+"  ");
			}
			System.out.println();
		}
		
	}

}
