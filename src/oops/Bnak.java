package oops;

import java.util.Scanner;

interface bank
{
	public void accountdetails(String name);
	public void balance();
	public void withdraw();
	public void deposit();	
}
class federalbank implements bank
{
static String bankname="federal";
int accountnumber;
int withdraw;
int deposit;
int balance=50000;
Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails(String name) {
		System.out.println("enter your account number");
		accountnumber=sc.nextInt();
		System.out.println("enter your name"+name+"\n"+"account number"+accountnumber+"\n"+"bankname"+bankname);
	}

	@Override
	public void balance() {
		
		System.out.println("balance"+balance);
	}

	@Override
	public void withdraw() {
		
		System.out.println("enter your withdrawal amount");
		withdraw=sc.nextInt();
		if(balance>withdraw)
		{
			balance=balance-withdraw;
			System.out.println("final balance="+balance);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("enter deposit amount");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("your final balance"+balance);
	}

	
	}
	
	

public class Bnak {

	public static void main(String[] args) {
		federalbank ob=new federalbank();
		ob.accountdetails("anoop");
		ob.balance();
		ob.deposit();
		ob.withdraw();
	}

}
