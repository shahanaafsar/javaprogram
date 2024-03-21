package oops;

interface bike
{
	public void acceleration();
	}

interface bikeaccessories
{
	public void bikedetails();
	}

class honda implements bike,bikeaccessories
{
@Override
public void acceleration() {
	System.out.println("honda accelaration");
}

@Override
public void bikedetails() {
	System.out.println("bike details");
	
}


}
class ola implements bike
{
@Override
public void acceleration() {
	System.out.println("ola acceleration");
	
}

}

public class Interfacee {

	public static void main(String[] args) {
		bike ob=new honda();
		ob.acceleration();
		ob=new ola();
		ob.acceleration();

	}

}




