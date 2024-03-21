package controlstatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter your choice 1.add 2.sub 3.mul 4.div");

		
		
		int c=sc.nextInt();
		switch(c)
		{
		
		case 1:System.out.println("sum of digits"+(a+b));
		break;
		case 2:System.out.println("difference of digits");
		break;
		case 3:System.out.println("multiplied value");
		break;
		case 4:System.out.println("divided value");
		break;
		
		default:System.out.println("invalid");
		}
		
		
		
			}

}
