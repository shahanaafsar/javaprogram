package controlstatement;

import java.util.Scanner;

public class Singlediamensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a=new int[3];
		/*a[0]=23;
		a[1]=34;
		a[2]=56;
		for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<=2;i++)
		{
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
		
	}

}
