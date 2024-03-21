package Stringsss;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ob=new Area();
		ob.mul();
		int s=ob.rectmul();
		System.out.println("area of rectangle="+s);
		double t=ob.trianglemul(6, 5);
		System.out.println("area of triangle="+t);
		ob.squaremul(4);
	}
//1.
	public void mul()
	{
		Double a=3.14,b=2.1,c;
		c=3.1*b*b;
		System.out.println("area of circle="+c);
	}
	//2.
	
	public int rectmul()
	{
		int a=2,b=5;
		int c=a*b;
		return c;
		
	}
	//3.with return with parameter
	
	public double trianglemul(double a, double b)
	{
		double s=0.5;
		double c=s*a*b;
		return c;
	}
	
	//4.
	public void squaremul(int a)

{
		int b=a*a;
		System.out.println("area of square ="+b);
		}
	
}
