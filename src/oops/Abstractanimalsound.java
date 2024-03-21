package oops;
abstract class animal
{
	abstract public void animalsound();
public void animaldetails()	
{
	System.out.println("animals");
	}
}
class dog extends animal
{
@Override
public void animalsound() {
	System.out.println("dog :bark");
}
}
class cat extends animal{

	@Override
	public void animalsound() {
		System.out.println("cat:meow");
	}
	
}
public class Abstractanimalsound {

	public static void main(String[] args) {
	/*dog ob= new dog();
	ob.animaldetails();
	ob.animalsound();
cat ob1=new cat();
ob1.animaldetails();
ob1.animalsound();/*/
		
		animal ob=new dog();
		ob.animalsound();
		animal ob1=new cat();	
		ob1.animalsound();
	
	}

}

