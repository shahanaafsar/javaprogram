package oops;
class father
{
	public void job()
	{
		System.out.println("doctor");
	}
}
class son extends father
{
	@Override
	public void job()

{
		
		System.out.println("engineer");
		super.job();
		}
	}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
son ob=new son();
ob.job();
	}

}
