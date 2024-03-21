package controlstatement;

import java.util.Scanner;

public class Stringmultidiamarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[][]ar=new String[3][2];
  System.out.println("enter the name");
  Scanner sc=new Scanner(System.in);
  
  for(int i=0; i<=2; i++)
  {
	  for(int j=0; j<=1; j++)
	  {
		  ar[i][j]=sc.next();
	  }
  }
  for(String v1[]: ar)
  {
	  for(String v2:v1)
	  {
		System.out.print(v2+"   ");  
	  }
	  System.out.println();
  }
  
  
  
	}
	
	

}
