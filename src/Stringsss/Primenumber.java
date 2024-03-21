package Stringsss;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		//int n = 7; 
		int flag;
		if(a%2==1)
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
		
		if(flag==0)
		{
			System.out.println("it is not a prime number");
		}
		else if (flag==1)
		{
			System.out.println("it is a prime number");
		}
	}

}
