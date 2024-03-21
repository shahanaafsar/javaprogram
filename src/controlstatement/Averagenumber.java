package controlstatement;

import java.util.Scanner;

public class Averagenumber {
public void sum(int s)

{
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	//int s=sc.nextInt();
int i=0;int sum=0;double avg=0;
	while(i<=s)
	{
		sum=sum+i;
		i++;
		avg=(sum/s);
		//return sum1;
	}
	System.out.println("sum of numbers"+sum);
	System.out.println("average of number="+avg);
	//return sum;
	}	


	

	public static void main(String[] args) {
		
		Averagenumber ob=new Averagenumber();
		ob.sum(5);
		//System.out.println("sum="+c)

		
			
	}
	}

