package oops;

class flowers1
{
	public void flowersmethod()
	{
		System.out.println("vvv");
	}
}
class rose1 extends flowers1
{
	public void rosemethod()
	{
		System.out.println("ccc");
	}
}
class jasmine1 extends flowers1
{
	public void jasminemethod()
	{
		System.out.println("sss");
	}
}

public class Heirarchialinheritance {

	public static void main(String[] args) {
		jasmine1 ob3=new jasmine1();
		ob3.jasminemethod();
		rose1 ob1=new rose1();
		ob1.rosemethod();
		flowers1 ob2=new flowers1();
		ob2.flowersmethod();
	}

}
