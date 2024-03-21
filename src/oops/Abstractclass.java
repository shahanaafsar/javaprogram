package oops;


abstract class car
{
	abstract public void speedlimit();
	public void cardetails()

	{
		System.out.println("car details");
	}
}

class maruthy extends car
{
	@Override
	public void speedlimit()
	{
		System.out.println("maruthy speedlimit");
	}
	
	}

class kia extends car
{
	@Override
	public void speedlimit() {
System.out.println("kia speedlimit");
		
	}
	}



public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maruthy ob=new maruthy();
		ob.cardetails();
		ob.speedlimit();
		kia ob1=new kia();
		ob1.cardetails();
		ob1.speedlimit();
	}

}

