package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob= new Methodoverloading();
		ob.add(3, 5);
		ob.add(5, 4.5);
		ob.add(3.8, 7);

	}	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
public void add(int a,double b)
{
	double c=a+b;
	System.out.println("value="+c);
	}
public void add(double a, int b)
{
	double c=a+b;
	System.out.println(c);
	}
}
