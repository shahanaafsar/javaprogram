package controlstatement;

import java.util.Scanner;

public class Foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]ar=new int[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i=0;i<=2;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("entered numbers=");
		for(int v:ar)
		{
			System.out.println(v);
		}
		
	}

}
