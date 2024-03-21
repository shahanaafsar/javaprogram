package controlstatement;

public class Bloodnestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =19,weight=65;
if(age>=18 )
{
	if( weight>=50)
	{
	System.out.println("eligible for donation");
	}
	else
	{
		System.out.println("not eligible for donation");
	}
}
	else
	{
		System.out.println("not eligible for donation");
	}

	
	}

}
