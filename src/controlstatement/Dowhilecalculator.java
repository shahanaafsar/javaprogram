package controlstatement;

import java.util.Scanner;

public class Dowhilecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter two numbers");
			Scanner sc=new Scanner(System.in);
			float a=sc.nextFloat();
			float b= sc.nextFloat();
			
			int d=0;
			do
			{
				System.out.println("enter your choice 1.addition 2.substraction 3.multiplication 4.division 5.exit");
				int c=sc.nextInt();
				
				switch(c)
				{
				case 1:System.out.println("result="+(a+b));
				break;
				case 2:System.out.println("result="+(a-b));
				break;
				case 3:System.out.println("result="+(a*b));
				break;
				case 4:System.out.println("result="+(a/b));
				break;
				case 5:System.out.println("result=exit");
				break;
				default: System.out.println("invalid");
				
				}
				
			}
				while(d!=5);
			

	}

}
