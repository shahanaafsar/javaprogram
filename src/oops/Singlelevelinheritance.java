package oops;

class parent
{
	public void parentmethod()
	{
		System.out.println("parent details");
	}
}

class child extends parent
{
	public void childmethod()
	{
		System.out.println("child details");
	}
	}
public class Singlelevelinheritance {

	public static void main(String[] args) {
		child ob=new child();
		ob.parentmethod();
		ob.childmethod();
	}

}
