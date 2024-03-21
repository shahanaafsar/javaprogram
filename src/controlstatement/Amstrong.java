package controlstatement;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b=a;
int rem,number=0;
while(a>0)
{
	rem=a%10;
	number=number+rem*rem*rem;
	a=a/10;
	}
if (number==b)
{
	System.out.println("it is an amstrong number");
	}
else
{
	System.out.println("not an amstrong number");
	}
	}

}
