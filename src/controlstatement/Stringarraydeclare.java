package controlstatement;

import java.util.Scanner;

public class Stringarraydeclare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]a=new String[3];
		a[0]= "asd";
		a[1]="qwe";
		a[2]="cvb";
		for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<=2;i++)
		{
			a[i]=sc.next();
			System.out.println(a[i]);
		}
		
	}

}
