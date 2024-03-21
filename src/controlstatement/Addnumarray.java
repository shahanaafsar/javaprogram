package controlstatement;

import java.util.Scanner;

import oops.Accessmodifier;

public class Addnumarray {

	public static void main(String[] args) {
		
		int[]a=new int[3];
		a[0]=3;
		a[1]=4;
		a[2]=a[0]+a[1];
		for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter numbers");
		int sum=0;
		for(int i=0;i<=2;i++)
		{
		a[i]=sc.nextInt();
		sum=sum+a[i];
		System.out.println(a[i]);
		System.out.println("sum of array="+sum);
		}
	}

}
