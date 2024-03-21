package oops;
class flowers
{
	public void flowersmethod()
	{
		System.out.println(" flowers details");
	}
}
class rose extends flowers
{
	public void rosemethod()
	{
		System.out.println("rose details");
	}
}
class jasmin extends rose
{
	public void jasminmethod()
	{
		System.out.println("jasmin details");
	}
}

	
public class Multilevelinheritance {

	public static void main(String[] args) {
		
		jasmin ob=new jasmin();
		ob.flowersmethod();
		ob.rosemethod();
		ob.jasminmethod();
	}
}

