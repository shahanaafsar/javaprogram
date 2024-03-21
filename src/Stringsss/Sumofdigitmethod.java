package Stringsss;

import java.util.Scanner;

public class Sumofdigitmethod {

	public static void main(String[] args) {
		
		Sumofdigitmethod ob=new Sumofdigitmethod();
		ob.add();
	}
	

	public void add()
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
	
		int sum = 0,n;
	while(a>0)
	{
		n=a%10;
		sum=sum+n;
		a=a/10;
	
	}
	System.out.println("sum of digits="+sum);
	
	}
}
