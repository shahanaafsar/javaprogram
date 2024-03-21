package oops;
interface basicanimal
{
	public void eat();
	public void sleep();
	}
class monkeyy
{
public void jumpmethod()
{
System.out.println("monkey jumbp");	
}
public void bitemethod()
{
System.out.println("monkey bite");	
}


}
class human extends monkeyy implements basicanimal
{
public void speak()
{
	System.out.println("humans are speak");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat...");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep...");
	}
}



public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
human ob=new human();
ob.bitemethod();
ob.eat();
ob.jumpmethod();
ob.sleep();
ob.speak();
	}

}


